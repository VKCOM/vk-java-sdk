package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Geo;
import java.util.List;
import java.util.Objects;

/**
 * Message object
 */
public class Message implements Validable {
    @SerializedName("action")
    private MessageAction action;

    /**
     * Only for messages from community. Contains user ID of community admin, who sent this message.
     */
    @SerializedName("admin_author_id")
    private Integer adminAuthorId;

    @SerializedName("attachments")
    private List<MessageAttachment> attachments;

    /**
     * Unique auto-incremented number for all messages with this peer
     */
    @SerializedName("conversation_message_id")
    private Integer conversationMessageId;

    /**
     * Date when the message has been sent in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Is it an deleted message
     */
    @SerializedName("deleted")
    private BoolInt deleted;

    /**
     * Message author's ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * Forwarded messages
     */
    @SerializedName("fwd_messages")
    private List<ForeignMessage> fwdMessages;

    @SerializedName("geo")
    private Geo geo;

    /**
     * Message ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Is it an important message
     */
    @SerializedName("important")
    private Boolean important;

    @SerializedName("is_hidden")
    private Boolean isHidden;

    @SerializedName("keyboard")
    private Keyboard keyboard;

    @SerializedName("template")
    private Template template;

    /**
     * Members number
     */
    @SerializedName("members_count")
    private Integer membersCount;

    /**
     * Information whether the message is outcoming
     */
    @SerializedName("out")
    @Required
    private BoolInt out;

    @SerializedName("payload")
    private String payload;

    /**
     * Peer ID
     */
    @SerializedName("peer_id")
    private Integer peerId;

    /**
     * ID used for sending messages. It returned only for outgoing messages
     */
    @SerializedName("random_id")
    private Integer randomId;

    @SerializedName("ref")
    private String ref;

    @SerializedName("ref_source")
    private String refSource;

    @SerializedName("reply_message")
    private ForeignMessage replyMessage;

    /**
     * Message text
     */
    @SerializedName("text")
    @Required
    private String text;

    /**
     * Date when the message has been updated in Unixtime
     */
    @SerializedName("update_time")
    private Integer updateTime;

    public MessageAction getAction() {
        return action;
    }

    public Message setAction(MessageAction action) {
        this.action = action;
        return this;
    }

    public Template getTemplate() {
        return template;
    }

    public Message setTemplate(Template template) {
        this.template = template;
        return this;
    }

    public Integer getAdminAuthorId() {
        return adminAuthorId;
    }

    public Message setAdminAuthorId(Integer adminAuthorId) {
        this.adminAuthorId = adminAuthorId;
        return this;
    }

    public List<MessageAttachment> getAttachments() {
        return attachments;
    }

    public Message setAttachments(List<MessageAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public Integer getConversationMessageId() {
        return conversationMessageId;
    }

    public Message setConversationMessageId(Integer conversationMessageId) {
        this.conversationMessageId = conversationMessageId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Message setDate(Integer date) {
        this.date = date;
        return this;
    }

    public boolean isDeleted() {
        return deleted == BoolInt.YES;
    }

    public BoolInt getDeleted() {
        return deleted;
    }

    public Integer getFromId() {
        return fromId;
    }

    public Message setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public List<ForeignMessage> getFwdMessages() {
        return fwdMessages;
    }

    public Message setFwdMessages(List<ForeignMessage> fwdMessages) {
        this.fwdMessages = fwdMessages;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public Message setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Message setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getImportant() {
        return important;
    }

    public Message setImportant(Boolean important) {
        this.important = important;
        return this;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public Message setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
        return this;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Message setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public Message setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
        return this;
    }

    public boolean isOut() {
        return out == BoolInt.YES;
    }

    public BoolInt getOut() {
        return out;
    }

    public String getPayload() {
        return payload;
    }

    public Message setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public Message setPeerId(Integer peerId) {
        this.peerId = peerId;
        return this;
    }

    public Integer getRandomId() {
        return randomId;
    }

    public Message setRandomId(Integer randomId) {
        this.randomId = randomId;
        return this;
    }

    public String getRef() {
        return ref;
    }

    public Message setRef(String ref) {
        this.ref = ref;
        return this;
    }

    public String getRefSource() {
        return refSource;
    }

    public Message setRefSource(String refSource) {
        this.refSource = refSource;
        return this;
    }

    public ForeignMessage getReplyMessage() {
        return replyMessage;
    }

    public Message setReplyMessage(ForeignMessage replyMessage) {
        this.replyMessage = replyMessage;
        return this;
    }

    public String getText() {
        return text;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public Message setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, peerId, keyboard, template, membersCount, attachments, adminAuthorId, updateTime, fromId, isHidden, refSource, out, geo, important, ref, fwdMessages, randomId, deleted, conversationMessageId, payload, replyMessage, action, id, text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(date, message.date) &&
                Objects.equals(keyboard, message.keyboard) &&
                Objects.equals(template, message.template) &&
                Objects.equals(attachments, message.attachments) &&
                Objects.equals(fromId, message.fromId) &&
                Objects.equals(isHidden, message.isHidden) &&
                Objects.equals(refSource, message.refSource) &&
                Objects.equals(conversationMessageId, message.conversationMessageId) &&
                Objects.equals(out, message.out) &&
                Objects.equals(peerId, message.peerId) &&
                Objects.equals(geo, message.geo) &&
                Objects.equals(important, message.important) &&
                Objects.equals(ref, message.ref) &&
                Objects.equals(updateTime, message.updateTime) &&
                Objects.equals(deleted, message.deleted) &&
                Objects.equals(payload, message.payload) &&
                Objects.equals(action, message.action) &&
                Objects.equals(adminAuthorId, message.adminAuthorId) &&
                Objects.equals(fwdMessages, message.fwdMessages) &&
                Objects.equals(membersCount, message.membersCount) &&
                Objects.equals(id, message.id) &&
                Objects.equals(randomId, message.randomId) &&
                Objects.equals(text, message.text) &&
                Objects.equals(replyMessage, message.replyMessage);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append("date=").append(date);
        sb.append(", keyboard=").append(keyboard);
        sb.append(", template=").append(template);
        sb.append(", attachments=").append(attachments);
        sb.append(", fromId=").append(fromId);
        sb.append(", isHidden=").append(isHidden);
        sb.append(", refSource='").append(refSource).append("'");
        sb.append(", conversationMessageId=").append(conversationMessageId);
        sb.append(", out=").append(out);
        sb.append(", peerId=").append(peerId);
        sb.append(", geo=").append(geo);
        sb.append(", important=").append(important);
        sb.append(", ref='").append(ref).append("'");
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", payload='").append(payload).append("'");
        sb.append(", action=").append(action);
        sb.append(", adminAuthorId=").append(adminAuthorId);
        sb.append(", fwdMessages=").append(fwdMessages);
        sb.append(", membersCount=").append(membersCount);
        sb.append(", id=").append(id);
        sb.append(", randomId=").append(randomId);
        sb.append(", text='").append(text).append("'");
        sb.append(", replyMessage=").append(replyMessage);
        sb.append('}');
        return sb.toString();
    }
}
