package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Geo;

import java.util.List;
import java.util.Objects;

/**
 * Message object
 */
public class Message {
    /**
     * Message ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Date when the message has been sent in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Information whether the message is outcoming
     */
    @SerializedName("out")
    private BoolInt out;

    /**
     * Message author's ID
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Message author's ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * ID used for sending messages. It returned only for outgoing messages
     */
    @SerializedName("random_id")
    private Integer randomId;

    /**
     * Is it an important message
     */
    @SerializedName("important")
    private BoolInt important;

    /**
     * Is it an deleted message
     */
    @SerializedName("deleted")
    private BoolInt deleted;

    /**
     * Forwarded messages
     */
    @SerializedName("fwd_messages")
    private List<Message> fwdMessages;

    /**
     * Information whether the messages is read
     */
    @SerializedName("read_state")
    private BoolInt readState;

    /**
     * Message title or chat title
     */
    @SerializedName("title")
    private String title;

    /**
     * Message text
     */
    @SerializedName("body")
    private String body;

    @SerializedName("attachments")
    private List<MessageAttachment> attachments;

    /**
     * Chat ID
     */
    @SerializedName("chat_id")
    private Integer chatId;

    @SerializedName("chat_active")
    private List<Integer> chatActive;

    /**
     * Chat users number
     */
    @SerializedName("users_count")
    private Integer usersCount;

    /**
     * Chat administrator ID
     */
    @SerializedName("admin_id")
    private Integer adminId;

    /**
     * URL of the preview image with 50px in width
     */
    @SerializedName("photo_50")
    private String photo50;

    /**
     * URL of the preview image with 100px in width
     */
    @SerializedName("photo_100")
    private String photo100;

    /**
     * URL of the preview image with 200px in width
     */
    @SerializedName("photo_200")
    private String photo200;

    @SerializedName("geo")
    private Geo geo;

    public Integer getId() {
        return id;
    }

    public Integer getDate() {
        return date;
    }

    public boolean isOut() {
        return out == BoolInt.YES;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getFromId() {
        return fromId;
    }

    public Integer getRandomId() {
        return randomId;
    }

    public boolean getImportant() {
        return important == BoolInt.YES;
    }

    public boolean getDeleted() {
        return deleted == BoolInt.YES;
    }

    public List<Message> getFwdMessages() {
        return fwdMessages;
    }

    public boolean isReadState() {
        return readState == BoolInt.YES;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public List<MessageAttachment> getAttachments() {
        return attachments;
    }

    public Integer getChatId() {
        return chatId;
    }

    public List<Integer> getChatActive() {
        return chatActive;
    }

    public Integer getUsersCount() {
        return usersCount;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public String getPhoto50() {
        return photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    public String getPhoto200() {
        return photo200;
    }

    public Geo getGeo() {
        return geo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, readState, attachments, chatId, photo50, usersCount, photo200, title, body, userId, fromId, out, important, geo, randomId, fwdMessages, deleted, chatActive, photo100, adminId, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(id, message.id) &&
                Objects.equals(date, message.date) &&
                Objects.equals(out, message.out) &&
                Objects.equals(userId, message.userId) &&
                Objects.equals(fromId, message.fromId) &&
                Objects.equals(randomId, message.randomId) &&
                Objects.equals(important, message.important) &&
                Objects.equals(deleted, message.deleted) &&
                Objects.equals(fwdMessages, message.fwdMessages) &&
                Objects.equals(readState, message.readState) &&
                Objects.equals(title, message.title) &&
                Objects.equals(body, message.body) &&
                Objects.equals(attachments, message.attachments) &&
                Objects.equals(chatId, message.chatId) &&
                Objects.equals(chatActive, message.chatActive) &&
                Objects.equals(usersCount, message.usersCount) &&
                Objects.equals(adminId, message.adminId) &&
                Objects.equals(photo50, message.photo50) &&
                Objects.equals(photo100, message.photo100) &&
                Objects.equals(photo200, message.photo200) &&
                Objects.equals(geo, message.geo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append("id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", out=").append(out);
        sb.append(", userId=").append(userId);
        sb.append(", randomId=").append(randomId);
        sb.append(", important=").append(important);
        sb.append(", deleted=").append(deleted);
        sb.append(", fwdMessages=").append(fwdMessages);
        sb.append(", readState=").append(readState);
        sb.append(", title='").append(title).append("'");
        sb.append(", body='").append(body).append("'");
        sb.append(", attachments=").append(attachments);
        sb.append(", chatId=").append(chatId);
        sb.append(", chatActive=").append(chatActive);
        sb.append(", usersCount=").append(usersCount);
        sb.append(", adminId=").append(adminId);
        sb.append(", photo50='").append(photo50).append("'");
        sb.append(", photo100='").append(photo100).append("'");
        sb.append(", photo200='").append(photo200).append("'");
        sb.append(", geo=").append(geo);
        sb.append('}');
        return sb.toString();
    }

    public static MessageBuilder builder() {
        return MessageBuilder.aMessage();
    }

    public static final class MessageBuilder {
        private Integer id;
        private Integer date;
        private BoolInt out;
        private Integer userId;
        private Integer fromId;
        private Integer randomId;
        private BoolInt important;
        private BoolInt deleted;
        private List<Message> fwdMessages;
        private BoolInt readState;
        private String title;
        private String body;
        private List<MessageAttachment> attachments;
        private Integer chatId;
        private List<Integer> chatActive;
        private Integer usersCount;
        private Integer adminId;
        private String photo50;
        private String photo100;
        private String photo200;
        private Geo geo;

        private MessageBuilder() {
        }

        public static MessageBuilder aMessage() {
            return new MessageBuilder();
        }

        public MessageBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public MessageBuilder date(Integer date) {
            this.date = date;
            return this;
        }

        public MessageBuilder out(BoolInt out) {
            this.out = out;
            return this;
        }

        public MessageBuilder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public MessageBuilder fromId(Integer fromId) {
            this.fromId = fromId;
            return this;
        }

        public MessageBuilder randomId(Integer randomId) {
            this.randomId = randomId;
            return this;
        }

        public MessageBuilder important(BoolInt important) {
            this.important = important;
            return this;
        }

        public MessageBuilder deleted(BoolInt deleted) {
            this.deleted = deleted;
            return this;
        }

        public MessageBuilder fwdMessages(List<Message> fwdMessages) {
            this.fwdMessages = fwdMessages;
            return this;
        }

        public MessageBuilder readState(BoolInt readState) {
            this.readState = readState;
            return this;
        }

        public MessageBuilder title(String title) {
            this.title = title;
            return this;
        }

        public MessageBuilder body(String body) {
            this.body = body;
            return this;
        }

        public MessageBuilder attachments(List<MessageAttachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public MessageBuilder chatId(Integer chatId) {
            this.chatId = chatId;
            return this;
        }

        public MessageBuilder chatActive(List<Integer> chatActive) {
            this.chatActive = chatActive;
            return this;
        }

        public MessageBuilder usersCount(Integer usersCount) {
            this.usersCount = usersCount;
            return this;
        }

        public MessageBuilder adminId(Integer adminId) {
            this.adminId = adminId;
            return this;
        }

        public MessageBuilder photo50(String photo50) {
            this.photo50 = photo50;
            return this;
        }

        public MessageBuilder photo100(String photo100) {
            this.photo100 = photo100;
            return this;
        }

        public MessageBuilder photo200(String photo200) {
            this.photo200 = photo200;
            return this;
        }

        public MessageBuilder geo(Geo geo) {
            this.geo = geo;
            return this;
        }

        public Message build() {
            Message message = new Message();
            message.title = this.title;
            message.usersCount = this.usersCount;
            message.photo100 = this.photo100;
            message.photo200 = this.photo200;
            message.out = this.out;
            message.chatActive = this.chatActive;
            message.body = this.body;
            message.chatId = this.chatId;
            message.photo50 = this.photo50;
            message.deleted = this.deleted;
            message.geo = this.geo;
            message.attachments = this.attachments;
            message.adminId = this.adminId;
            message.fromId = this.fromId;
            message.important = this.important;
            message.id = this.id;
            message.date = this.date;
            message.randomId = this.randomId;
            message.fwdMessages = this.fwdMessages;
            message.userId = this.userId;
            message.readState = this.readState;
            return message;
        }
    }
}
