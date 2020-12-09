package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * LinkButton object
 */
public class LinkButton implements Validable {
    /**
     * Button action
     */
    @SerializedName("action")
    private LinkButtonAction action;

    /**
     * Button title
     */
    @SerializedName("title")
    private String title;

    /**
     * Target block id
     */
    @SerializedName("block_id")
    private String blockId;

    /**
     * Target section id
     */
    @SerializedName("section_id")
    private String sectionId;

    /**
     * curator id
     */
    @SerializedName("curator_id")
    private Integer curatorId;

    /**
     * Owner id
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Button icon name, e.g. 'phone' or 'gift'
     */
    @SerializedName("icon")
    private String icon;

    @SerializedName("style")
    private LinkButtonStyle style;

    public LinkButtonAction getAction() {
        return action;
    }

    public LinkButton setAction(LinkButtonAction action) {
        this.action = action;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public LinkButton setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBlockId() {
        return blockId;
    }

    public LinkButton setBlockId(String blockId) {
        this.blockId = blockId;
        return this;
    }

    public String getSectionId() {
        return sectionId;
    }

    public LinkButton setSectionId(String sectionId) {
        this.sectionId = sectionId;
        return this;
    }

    public Integer getCuratorId() {
        return curatorId;
    }

    public LinkButton setCuratorId(Integer curatorId) {
        this.curatorId = curatorId;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public LinkButton setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public LinkButton setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public LinkButtonStyle getStyle() {
        return style;
    }

    public LinkButton setStyle(LinkButtonStyle style) {
        this.style = style;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockId, curatorId, icon, action, style, sectionId, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkButton linkButton = (LinkButton) o;
        return Objects.equals(sectionId, linkButton.sectionId) &&
                Objects.equals(ownerId, linkButton.ownerId) &&
                Objects.equals(curatorId, linkButton.curatorId) &&
                Objects.equals(icon, linkButton.icon) &&
                Objects.equals(action, linkButton.action) &&
                Objects.equals(style, linkButton.style) &&
                Objects.equals(title, linkButton.title) &&
                Objects.equals(blockId, linkButton.blockId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LinkButton{");
        sb.append("sectionId='").append(sectionId).append("'");
        sb.append(", ownerId=").append(ownerId);
        sb.append(", curatorId=").append(curatorId);
        sb.append(", icon='").append(icon).append("'");
        sb.append(", action=").append(action);
        sb.append(", style=").append(style);
        sb.append(", title='").append(title).append("'");
        sb.append(", blockId='").append(blockId).append("'");
        sb.append('}');
        return sb.toString();
    }
}
