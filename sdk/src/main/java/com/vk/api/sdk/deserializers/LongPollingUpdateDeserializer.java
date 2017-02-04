package com.vk.api.sdk.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.messages.Message;
import com.vk.api.sdk.objects.messages.MessageAttachment;
import com.vk.api.sdk.objects.updates.*;

import java.lang.reflect.Type;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LongPollingUpdateDeserializer implements JsonDeserializer<Update> {

    private static final int DELETE_MESSAGE = 0;
    private static final int SET_MESSAGE_FLAGS = 1;
    private static final int ADD_MESSAGE_FLAGS = 2;
    private static final int REMOVE_MESSAGE_FLAGS = 3;
    private static final int ADD_MESSAGE = 4;

    private static final int READ_ALL_INCOMING = 6;
    private static final int READ_ALL_OUTGOING = 7;

    private static final int FRIEND_ONLINE = 8;
    private static final int FRIEND_OFFLINE = 9;

    private static final int REMOVE_DIALOG_FLAGS = 10;
    private static final int SET_DIALOG_FLAGS = 11;
    private static final int ADD_DIALOG_FLAGS = 12;

    private static final int CHAT_CHANGED = 51;

    private static final int USER_TYPED_IN_DIALOG = 61;
    private static final int USER_TYPED_IN_CHAT = 62;

    private static final int USER_MADE_A_CALL = 70;

    private static final int UNREAD_MESSAGE_COUNT = 80;

    private static final int NOTIFICATION_SETTINGS_CHANGED = 114;

    //TODO implement events below

    @Override
    public Update deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (!json.isJsonArray()) {
            throw new IllegalArgumentException("Can parse only an Array");
        }

        Iterator<JsonElement> elementIterator = json.getAsJsonArray().iterator();
        int updateType = elementIterator.next().getAsInt();

        switch (updateType) {
            case ADD_MESSAGE:
                return parseAddMessage(elementIterator);
            case DELETE_MESSAGE:
                return parseDeleteMessage(elementIterator);
            case ADD_MESSAGE_FLAGS:
                return parseAddMessageFlags(elementIterator);
            case SET_MESSAGE_FLAGS:
                return parseSetMessageFlags(elementIterator);
            case REMOVE_MESSAGE_FLAGS:
                return parseRemoveMessageFlags(elementIterator);
            case READ_ALL_INCOMING:
                return parseReadAllIncomingMeesages(elementIterator);
            case READ_ALL_OUTGOING:
                return parseReadAllOutgoingMeesages(elementIterator);
            case FRIEND_ONLINE:
                return parseFriendOnline(elementIterator);
            case FRIEND_OFFLINE:
                return parseFriendOffline(elementIterator);
            case REMOVE_DIALOG_FLAGS:
                return parseRemoveDialogFlags(elementIterator);
            case SET_DIALOG_FLAGS:
                return parseSetDialogFlags(elementIterator);
            case ADD_DIALOG_FLAGS:
                return parseAddDialogFlags(elementIterator);
            case CHAT_CHANGED:
                return parseChatChanged(elementIterator);
            case USER_TYPED_IN_DIALOG:
                return parseUserTypedInDialog(elementIterator);
            case USER_TYPED_IN_CHAT:
                return parseUserTypesInChat(elementIterator);
            case USER_MADE_A_CALL:
                return parseUserMadeCall(elementIterator);
            case UNREAD_MESSAGE_COUNT:
                return parseUnreadMessageCount(elementIterator);
            case NOTIFICATION_SETTINGS_CHANGED:
                return parseNotificationSettingsChanged(elementIterator);
            default:
                throw new IllegalArgumentException("Unsupported update type: " + updateType);
        }
    }

    // $message_id,$flags,$peer_id,$timestamp,$subject,$text,[$attachments],[$random_id]
    // add a new message
    private Update parseAddMessage(Iterator<JsonElement> items) {
        int messageId = items.next().getAsInt();
        Set<MessageFlag> flags = MessageFlag.fromCode(items.next().getAsInt());
        int fromId = items.next().getAsInt();

        Message.MessageBuilder messageBuilder = Message.builder()
                .id(messageId)
                        //flags are set a little bit later
                .userId(fromId);

        //Such event can be caught in two ways: via messages.getLongPolingHistory and via long-polling server
        //in case of messages.getLongPolingHistory, there will be only 4 integers, describing message
        if (items.hasNext()) {
            int timestamp = items.next().getAsInt();
            String title = items.next().getAsString();
            String body = items.next().getAsString();

            List<MessageAttachment> attachments = null;
            if (items.hasNext()) {
                items.next().getAsJsonArray();
            }

            Integer randomId = null;
            if (items.hasNext()) {
                randomId = items.next().getAsInt();
            }

            messageBuilder
                    .date(timestamp)
                    .title(title)
                    .body(body)
                    .attachments(attachments)
                    .randomId(randomId);
        }


        for (MessageFlag flag : flags) {
            if (flag == MessageFlag.UNREAD) {
                messageBuilder.readState(BoolInt.NO);
            } else if (flag == MessageFlag.OUTBOX) {
                messageBuilder.out(BoolInt.YES);
            } else if (flag == MessageFlag.REPLIED) {
                //TODO
            } else if (flag == MessageFlag.IMPORTANT) {
                messageBuilder.important(BoolInt.YES);
            } else if (flag == MessageFlag.CHAT) {
                //TODO
            } else if (flag == MessageFlag.FRIENDS) {
                //TODO
            } else if (flag == MessageFlag.SPAM) {
                //TODO
            } else if (flag == MessageFlag.DELETED) {
                messageBuilder.deleted(BoolInt.YES);
            } else if (flag == MessageFlag.FIXED) {
                //TODO
            } else if (flag == MessageFlag.MEDIA) {
                //TODO
            } else {
                throw new IllegalArgumentException("Unsupported message flag: " + flag);
            }
        }

        return new AddMessage(messageBuilder.build());
    }

    //$message_id,0 -- delete a message with the local_id indicated
    private Update parseDeleteMessage(Iterator<JsonElement> items) {
        int messageId = items.next().getAsInt();

        return new DeleteMessage(messageId);
    }

    //$message_id,$flags -- replace message flags (FLAGS:=$flags)
    private Update parseSetMessageFlags(Iterator<JsonElement> items) {
        int messageId = items.next().getAsInt();
        Set<MessageFlag> flags = MessageFlag.fromCode(items.next().getAsInt());

        return new SetMessageFlags(messageId, flags);
    }

    //$message_id,$mask[,$user_id] -- install message flags (FLAGS|=$mask)
    private Update parseAddMessageFlags(Iterator<JsonElement> items) {
        int messageId = items.next().getAsInt();
        Set<MessageFlag> flags = MessageFlag.fromCode(items.next().getAsInt());
        Integer userId = null;
        if (items.hasNext()) {
            userId = items.next().getAsInt();
        }

        return new AddMessageFlags(messageId, flags, userId);
    }

    //$message_id,$mask[,$user_id] -- reset message flags (FLAGS&=~$mask)
    private Update parseRemoveMessageFlags(Iterator<JsonElement> items) {
        int messageId = items.next().getAsInt();
        Set<MessageFlag> flags = MessageFlag.fromCode(items.next().getAsInt());
        Integer userId = null;
        if (items.hasNext()) {
            userId = items.next().getAsInt();
        }

        return new RemoveMessageFlags(messageId, flags, userId);
    }

    //$peer_id,$local_id -- read all incoming messages with $peer_id until $local_id
    private Update parseReadAllIncomingMeesages(Iterator<JsonElement> items) {
        int peerId = items.next().getAsInt();
        int upToMsgId = items.next().getAsInt();

        return new ReadAllIncomingMessages(peerId, upToMsgId);
    }

    //$peer_id,$local_id -- read all outgoing messages with $peer_id until $local_id
    private Update parseReadAllOutgoingMeesages(Iterator<JsonElement> items) {
        int peerId = items.next().getAsInt();
        int upToMsgId = items.next().getAsInt();

        return new ReadAllOutgoingMessages(peerId, upToMsgId);
    }

    //-$user_id,$extra -- a friend of $user_id is online,
    // $extra is not 0 if flag 64 was transmitted in mode.
    // $extra mod 256 is a platform id (see the list below)
    private Update parseFriendOnline(Iterator<JsonElement> items) {
        int userId = -items.next().getAsInt();
        int extra = items.next().getAsInt();
        Platform platform = Platform.fromCode(extra % 256);

        return new FriendOnline(userId, platform);
    }

    //-$user_id,$flags -- a friend of $user_id is offline
    // $flags equals 0 if the user has left the site (for example, clicked on "Log Out"),
    // and 1 if offline upon timeout (for example, the status is set to "away"))
    private Update parseFriendOffline(Iterator<JsonElement> items) {
        int userId = -items.next().getAsInt();
        boolean timeout = items.next().getAsInt() == 1;

        return new FriendOffline(userId, timeout);
    }

    // $peer_id,$mask
    // Reset dialog flags $peer_id. Corresponds to the operation (PEER_FLAGS &= ~$flags).
    // An event is returned only for community messages.
    private Update parseRemoveDialogFlags(Iterator<JsonElement> items) {
        int peerId = items.next().getAsInt();
        Set<DialogFlag> flags = DialogFlag.fromCode(items.next().getAsInt());

        return new RemoveDialogFlags(peerId, flags);
    }

    // $peer_id,$mask
    // Replace dialog flags $peer_id. Corresponds to the operation (PEER_FLAGS:= $flags).
    // An event is returned only for community messages.
    private Update parseSetDialogFlags(Iterator<JsonElement> items) {
        int peerId = items.next().getAsInt();
        Set<DialogFlag> flags = DialogFlag.fromCode(items.next().getAsInt());

        return new SetDialogFlags(peerId, flags);
    }

    // $peer_id,$mask
    // Install dialog flags $peer_id. Corresponds to the operation (PEER_FLAGS|= $flags).
    // An event is returned only for community messages.
    private Update parseAddDialogFlags(Iterator<JsonElement> items) {
        int peerId = items.next().getAsInt();
        Set<DialogFlag> flags = DialogFlag.fromCode(items.next().getAsInt());

        return new AddDialogFlags(peerId, flags);
    }

    // $chat_id,$self
    // One of the parameters (content, topic) of the conversation $chat_id was changed.
    // $self — 1 or 0 (whether the change was caused by the user).
    private Update parseChatChanged(Iterator<JsonElement> items) {
        int chatId = items.next().getAsInt();
        boolean byOneself = items.next().getAsInt() > 0;

        return new ChatChanged(chatId, byOneself);
    }

    // $user_id,$flags
    // $user_id started typing text in a dialog.
    // The event is sent once in ~5 sec while constantly typing. $flags = 1
    private Update parseUserTypedInDialog(Iterator<JsonElement> items) {
        int userId = items.next().getAsInt();

        return new UserTypedInDialog(userId);
    }

    // $user_id,$chat_id
    // $user_id started typing in $chat_id.
    private Update parseUserTypesInChat(Iterator<JsonElement> items) {
        int userId = items.next().getAsInt();
        int chatId = items.next().getAsInt();

        return new UserTypedInChat(userId, chatId);
    }

    // $user_id,$call_id — $user_id made a call with $call_id identifier.
    private Update parseUserMadeCall(Iterator<JsonElement> items) {
        int userId = items.next().getAsInt();
        int callId = items.next().getAsInt();

        return new UserMadeCall(userId, callId);
    }

    // $count,0 — new unread messages counter in the left menu equals $count.
    private Update parseUnreadMessageCount(Iterator<JsonElement> items) {
        int count = items.next().getAsInt();

        return new UnreadMessageCount(count);
    }

    // $peerId, $sound, $disabled_until
    // notification settings changed, where peerId is a chat's/user's $peer_id,
    // sound — 1 || 0, sound notifications on/off,
    // disabled_until — notifications disabled for a certain period
    //  (-1: forever; 0: notifications enabled; other: timestamp for time to switch back on).
    private Update parseNotificationSettingsChanged(Iterator<JsonElement> items) {
        int peerId = items.next().getAsInt();
        boolean soundOn = items.next().getAsInt() > 0;

        int timestamp = items.next().getAsInt();
        Instant disabledUntil = Instant.EPOCH;
        boolean disabled = true;

        if (timestamp < 0) {
            disabledUntil = Instant.MAX;
        } else if (timestamp == 0) {
            disabled = false;
        } else {
            disabledUntil = Instant.ofEpochSecond(timestamp);
        }

        return new NotificationSettingsChanged(peerId, soundOn, disabledUntil, disabled);
    }
}
