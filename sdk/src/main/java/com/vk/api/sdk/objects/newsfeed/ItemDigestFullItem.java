package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.wall.Wallpost;
import com.vk.api.sdk.objects.wall.WallpostAttachment;
import java.util.Objects;

/**
 * ItemDigestFullItem object
 */
public class ItemDigestFullItem implements Validable {
    @SerializedName("text")
    private String text;

    @SerializedName("source_name")
    private String sourceName;

    @SerializedName("attachment_index")
    private Integer attachmentIndex;

    @SerializedName("attachment")
    private WallpostAttachment attachment;

    @SerializedName("style")
    private ItemDigestFullItemStyle style;

    @SerializedName("post")
    @Required
    private Wallpost post;

    public String getText() {
        return text;
    }

    public ItemDigestFullItem setText(String text) {
        this.text = text;
        return this;
    }

    public String getSourceName() {
        return sourceName;
    }

    public ItemDigestFullItem setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    public Integer getAttachmentIndex() {
        return attachmentIndex;
    }

    public ItemDigestFullItem setAttachmentIndex(Integer attachmentIndex) {
        this.attachmentIndex = attachmentIndex;
        return this;
    }

    public WallpostAttachment getAttachment() {
        return attachment;
    }

    public ItemDigestFullItem setAttachment(WallpostAttachment attachment) {
        this.attachment = attachment;
        return this;
    }

    public ItemDigestFullItemStyle getStyle() {
        return style;
    }

    public ItemDigestFullItem setStyle(ItemDigestFullItemStyle style) {
        this.style = style;
        return this;
    }

    public Wallpost getPost() {
        return post;
    }

    public ItemDigestFullItem setPost(Wallpost post) {
        this.post = post;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachment, post, attachmentIndex, style, text, sourceName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDigestFullItem itemDigestFullItem = (ItemDigestFullItem) o;
        return Objects.equals(attachmentIndex, itemDigestFullItem.attachmentIndex) &&
                Objects.equals(attachment, itemDigestFullItem.attachment) &&
                Objects.equals(post, itemDigestFullItem.post) &&
                Objects.equals(style, itemDigestFullItem.style) &&
                Objects.equals(text, itemDigestFullItem.text) &&
                Objects.equals(sourceName, itemDigestFullItem.sourceName);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemDigestFullItem{");
        sb.append("attachmentIndex=").append(attachmentIndex);
        sb.append(", attachment=").append(attachment);
        sb.append(", post=").append(post);
        sb.append(", style='").append(style).append("'");
        sb.append(", text='").append(text).append("'");
        sb.append(", sourceName='").append(sourceName).append("'");
        sb.append('}');
        return sb.toString();
    }
}
