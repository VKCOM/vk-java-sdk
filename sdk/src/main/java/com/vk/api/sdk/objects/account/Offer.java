package com.vk.api.sdk.objects.account;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * Offer object
 */
public class Offer implements Validable {
    /**
     * Offer description
     */
    @SerializedName("description")
    private String description;

    /**
     * Offer ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * URL of the preview image
     */
    @SerializedName("img")
    private URI img;

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
     * Offer price
     */
    @SerializedName("price")
    private Integer price;

    /**
     * Offer short description
     */
    @SerializedName("short_description")
    private String shortDescription;

    /**
     * Offer tag
     */
    @SerializedName("tag")
    private String tag;

    /**
     * Offer title
     */
    @SerializedName("title")
    private String title;

    /**
     * Currency amount
     */
    @SerializedName("currency_amount")
    private Float currencyAmount;

    /**
     * Link id
     */
    @SerializedName("link_id")
    private Integer linkId;

    /**
     * Link type
     */
    @SerializedName("link_type")
    private OfferLinkType linkType;

    public String getDescription() {
        return description;
    }

    public Offer setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Offer setId(Integer id) {
        this.id = id;
        return this;
    }

    public URI getImg() {
        return img;
    }

    public Offer setImg(URI img) {
        this.img = img;
        return this;
    }

    public String getInstruction() {
        return instruction;
    }

    public Offer setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }

    public String getInstructionHtml() {
        return instructionHtml;
    }

    public Offer setInstructionHtml(String instructionHtml) {
        this.instructionHtml = instructionHtml;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public Offer setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Offer setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public String getTag() {
        return tag;
    }

    public Offer setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Offer setTitle(String title) {
        this.title = title;
        return this;
    }

    public Float getCurrencyAmount() {
        return currencyAmount;
    }

    public Offer setCurrencyAmount(Float currencyAmount) {
        this.currencyAmount = currencyAmount;
        return this;
    }

    public Integer getLinkId() {
        return linkId;
    }

    public Offer setLinkId(Integer linkId) {
        this.linkId = linkId;
        return this;
    }

    public OfferLinkType getLinkType() {
        return linkType;
    }

    public Offer setLinkType(OfferLinkType linkType) {
        this.linkType = linkType;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(img, linkId, instruction, price, currencyAmount, description, linkType, shortDescription, id, tag, title, instructionHtml);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return Objects.equals(linkType, offer.linkType) &&
                Objects.equals(shortDescription, offer.shortDescription) &&
                Objects.equals(img, offer.img) &&
                Objects.equals(currencyAmount, offer.currencyAmount) &&
                Objects.equals(instruction, offer.instruction) &&
                Objects.equals(price, offer.price) &&
                Objects.equals(description, offer.description) &&
                Objects.equals(instructionHtml, offer.instructionHtml) &&
                Objects.equals(id, offer.id) &&
                Objects.equals(tag, offer.tag) &&
                Objects.equals(title, offer.title) &&
                Objects.equals(linkId, offer.linkId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Offer{");
        sb.append("linkType='").append(linkType).append("'");
        sb.append(", shortDescription='").append(shortDescription).append("'");
        sb.append(", img=").append(img);
        sb.append(", currencyAmount=").append(currencyAmount);
        sb.append(", instruction='").append(instruction).append("'");
        sb.append(", price=").append(price);
        sb.append(", description='").append(description).append("'");
        sb.append(", instructionHtml='").append(instructionHtml).append("'");
        sb.append(", id=").append(id);
        sb.append(", tag='").append(tag).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", linkId=").append(linkId);
        sb.append('}');
        return sb.toString();
    }
}
