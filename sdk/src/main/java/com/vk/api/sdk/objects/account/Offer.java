package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Offer object
 */
public class Offer {
    /**
     * Offer ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Offer title
     */
    @SerializedName("title")
    private String title;

    /**
     * Instruction how to process the offer
     */
    @SerializedName("instruction")
    private String instruction;

    /**
     * Instruction how to process the offer (HTML format)
     */
    @SerializedName("instruction_html")
    private String instructionHtml;

    /**
     * Offer short description
     */
    @SerializedName("short_description")
    private String shortDescription;

    /**
     * Offer description
     */
    @SerializedName("description")
    private String description;

    /**
     * URL of the preview image
     */
    @SerializedName("img")
    private String img;

    /**
     * Offer tag
     */
    @SerializedName("tag")
    private String tag;

    /**
     * Offer price
     */
    @SerializedName("price")
    private Integer price;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getInstruction() {
        return instruction;
    }

    public String getInstructionHtml() {
        return instructionHtml;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getImg() {
        return img;
    }

    public String getTag() {
        return tag;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(img, instruction, price, description, id, shortDescription, tag, title, instructionHtml);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return Objects.equals(id, offer.id) &&
                Objects.equals(title, offer.title) &&
                Objects.equals(instruction, offer.instruction) &&
                Objects.equals(instructionHtml, offer.instructionHtml) &&
                Objects.equals(shortDescription, offer.shortDescription) &&
                Objects.equals(description, offer.description) &&
                Objects.equals(img, offer.img) &&
                Objects.equals(tag, offer.tag) &&
                Objects.equals(price, offer.price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Offer{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", instruction='").append(instruction).append("'");
        sb.append(", instructionHtml='").append(instructionHtml).append("'");
        sb.append(", shortDescription='").append(shortDescription).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", img='").append(img).append("'");
        sb.append(", tag='").append(tag).append("'");
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
