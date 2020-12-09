package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Description of the action, that should be performed on button click
 */
public class KeyboardButtonAction implements Validable {
    /**
     * Fragment value in app link like vk.com/app{app_id}_-654321#hash
     */
    @SerializedName("app_id")
    private Integer appId;

    /**
     * Fragment value in app link like vk.com/app123456_-654321#{hash}
     */
    @SerializedName("hash")
    private String hash;

    /**
     * Label for button
     */
    @SerializedName("label")
    private String label;

    /**
     * link for button
     */
    @SerializedName("link")
    private String link;

    /**
     * Fragment value in app link like vk.com/app123456_{owner_id}#hash
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Additional data sent along with message for developer convenience
     */
    @SerializedName("payload")
    private String payload;

    /**
     * Button type
     */
    @SerializedName("type")
    @Required
    private TemplateActionTypeNames type;

    public Integer getAppId() {
        return appId;
    }

    public KeyboardButtonAction setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public KeyboardButtonAction setHash(String hash) {
        this.hash = hash;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public KeyboardButtonAction setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLink() {
        return link;
    }

    public KeyboardButtonAction setLink(String link) {
        this.link = link;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public KeyboardButtonAction setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getPayload() {
        return payload;
    }

    public KeyboardButtonAction setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    public TemplateActionTypeNames getType() {
        return type;
    }

    public KeyboardButtonAction setType(TemplateActionTypeNames type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, appId, link, label, ownerId, type, hash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyboardButtonAction keyboardButtonAction = (KeyboardButtonAction) o;
        return Objects.equals(payload, keyboardButtonAction.payload) &&
                Objects.equals(ownerId, keyboardButtonAction.ownerId) &&
                Objects.equals(link, keyboardButtonAction.link) &&
                Objects.equals(label, keyboardButtonAction.label) &&
                Objects.equals(type, keyboardButtonAction.type) &&
                Objects.equals(appId, keyboardButtonAction.appId) &&
                Objects.equals(hash, keyboardButtonAction.hash);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("KeyboardButtonAction{");
        sb.append("payload='").append(payload).append("'");
        sb.append(", ownerId=").append(ownerId);
        sb.append(", link='").append(link).append("'");
        sb.append(", label='").append(label).append("'");
        sb.append(", type=").append(type);
        sb.append(", appId=").append(appId);
        sb.append(", hash='").append(hash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
