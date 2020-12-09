package com.vk.api.sdk.objects.media;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Image;
import com.vk.api.sdk.objects.video.RestrictionButton;
import java.util.List;
import java.util.Objects;

/**
 * Media restrictions
 */
public class Restriction implements Validable {
    @SerializedName("text")
    private String text;

    @SerializedName("title")
    @Required
    private String title;

    @SerializedName("button")
    private RestrictionButton button;

    /**
     * Need show restriction always or not
     */
    @SerializedName("always_shown")
    private BoolInt alwaysShown;

    /**
     * Need blur current video or not
     */
    @SerializedName("blur")
    private BoolInt blur;

    /**
     * Can play video or not
     */
    @SerializedName("can_play")
    private BoolInt canPlay;

    /**
     * Can preview video or not
     */
    @SerializedName("can_preview")
    private BoolInt canPreview;

    @SerializedName("card_icon")
    private List<Image> cardIcon;

    @SerializedName("list_icon")
    private List<Image> listIcon;

    public String getText() {
        return text;
    }

    public Restriction setText(String text) {
        this.text = text;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Restriction setTitle(String title) {
        this.title = title;
        return this;
    }

    public RestrictionButton getButton() {
        return button;
    }

    public Restriction setButton(RestrictionButton button) {
        this.button = button;
        return this;
    }

    public boolean isAlwaysShown() {
        return alwaysShown == BoolInt.YES;
    }

    public BoolInt getAlwaysShown() {
        return alwaysShown;
    }

    public boolean isBlur() {
        return blur == BoolInt.YES;
    }

    public BoolInt getBlur() {
        return blur;
    }

    public boolean canPlay() {
        return canPlay == BoolInt.YES;
    }

    public BoolInt getCanPlay() {
        return canPlay;
    }

    public boolean canPreview() {
        return canPreview == BoolInt.YES;
    }

    public BoolInt getCanPreview() {
        return canPreview;
    }

    public List<Image> getCardIcon() {
        return cardIcon;
    }

    public Restriction setCardIcon(List<Image> cardIcon) {
        this.cardIcon = cardIcon;
        return this;
    }

    public List<Image> getListIcon() {
        return listIcon;
    }

    public Restriction setListIcon(List<Image> listIcon) {
        this.listIcon = listIcon;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(button, cardIcon, alwaysShown, canPlay, listIcon, blur, text, title, canPreview);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restriction restriction = (Restriction) o;
        return Objects.equals(button, restriction.button) &&
                Objects.equals(canPlay, restriction.canPlay) &&
                Objects.equals(cardIcon, restriction.cardIcon) &&
                Objects.equals(alwaysShown, restriction.alwaysShown) &&
                Objects.equals(blur, restriction.blur) &&
                Objects.equals(text, restriction.text) &&
                Objects.equals(title, restriction.title) &&
                Objects.equals(canPreview, restriction.canPreview) &&
                Objects.equals(listIcon, restriction.listIcon);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Restriction{");
        sb.append("button=").append(button);
        sb.append(", canPlay=").append(canPlay);
        sb.append(", cardIcon=").append(cardIcon);
        sb.append(", alwaysShown=").append(alwaysShown);
        sb.append(", blur=").append(blur);
        sb.append(", text='").append(text).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", canPreview=").append(canPreview);
        sb.append(", listIcon=").append(listIcon);
        sb.append('}');
        return sb.toString();
    }
}
