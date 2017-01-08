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

    //TODO implement events below
    //51,$chat_id,$self -- one of $chat_id's parameters (title, participants) was changed. $self shows if changes were made by user themself
    //61,$user_id,$flags -- $user_id started typing text in a dialog. The event is sent once in ~5 sec while constantly typing. $flags = 1
    //62,$user_id,$chat_id — $user_id started typing in $chat_id.
    //70,$user_id,$call_id — $user_id made a call with $call_id identifier.
    //80,$count,0 — new unread messages counter in the left menu equals $count.
    //114,{ $peerId, $sound, $disabled_until } — notification settings changed, where peerId is a chat's/user's $peer_id, sound — 1 || 0, sound notifications on/off, disabled_until — notifications disabled for a certain period (-1: forever; 0: notifications enabled; other: timestamp for time to switch back on).


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
            default:
                throw new IllegalArgumentException("Unsupported update type: " + updateType);
        }
    }

    //$message_id,$flags,$from_id,$timestamp,$subject,$text,$attachments -- add a new message
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
            long epochSeconds = items.next().getAsLong();
            Instant instant = Instant.ofEpochSecond(epochSeconds);
            String title = items.next().getAsString();
            String body = items.next().getAsString();
            List<MessageAttachment> attachments = null;

            messageBuilder
                    .date((int)instant.toEpochMilli())
                    .title(title)
                    .body(body)
                    .attachments(attachments);
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
}
