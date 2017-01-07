package com.vk.api.sdk.deserializers;

import com.google.gson.*;
import contactus.core.Data;
import contactus.core.update.*;
import contactus.domain.Message;
import contactus.domain.MessageFlag;

import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public enum UpdateDeserializer implements JsonDeserializer<Update>{
    INSTANCE;

    private static final int DELETE_MESSAGE = 0;
    private static final int SET_MESSAGE_FLAGS = 1;
    private static final int ADD_MESSAGE_FLAGS = 2;
    private static final int REMOVE_MESSAGE_FLAGS = 3;
    private static final int ADD_MESSAGE = 4;

    private static final List<Integer> MESSAGE_FLAGS = Arrays.asList(SET_MESSAGE_FLAGS, ADD_MESSAGE_FLAGS, REMOVE_MESSAGE_FLAGS, ADD_MESSAGE);

    @Override
    public Update deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Update result = null;

        if (json.isJsonArray()) {
            JsonArray jsonArray = json.getAsJsonArray();
            int type = jsonArray.get(0).getAsInt();

            if (type == DELETE_MESSAGE) {
                result = new DeleteMessage(jsonArray.get(1).getAsLong());

            } else if (MESSAGE_FLAGS.contains(type)) {
                long messageId = jsonArray.get(1).getAsLong();
                Set<MessageFlag> flags = MessageFlag.fromCode(jsonArray.get(2).getAsInt());

                if (type == SET_MESSAGE_FLAGS) {
                    result = new SetMessageFlags(messageId, flags);
                } else {
                    long userId = 0;
                    if (jsonArray.size() >= 4) {
                        userId = jsonArray.get(3).getAsLong();
                    }

                    if (type == ADD_MESSAGE_FLAGS) {
                        result = new AddMessageFlags(messageId, flags, userId);
                    } else if (type == REMOVE_MESSAGE_FLAGS) {
                        result = new RemoveMessageFlags(messageId, flags, userId);
                    } else if (type == ADD_MESSAGE) {
                        long epochSeconds = jsonArray.get(4).getAsLong();
                        ZonedDateTime dateTime = Instant
                                .ofEpochSecond(epochSeconds)
                                .atZone(ZoneId.systemDefault());
                        String subject = jsonArray.get(5).getAsString();
                        String text = jsonArray.get(6).getAsString();
                        Object attachments = null;

                        if (jsonArray.size() >= 8) {
                            //TODO parse attachments!
                            attachments = null;
                        }

                        Message message = Message.builder()
                                .id(messageId)
                                .userId(userId)
                                .dateTime(dateTime)
                                .subject(subject)
                                .body(text)
                                .flags(flags)
                                .hasAttachment(attachments != null)
                                .build();
                        result = new AddMessage(message);
                    }
                }

            } else {
                result = new Update(){
                    @Override
                    public void accept(Data data) {

                    }
                };
            }
        }

        return result;
    }
}
