package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.market.Currency;

import java.util.Objects;

/**
 * MarketInfo object
 */
public class MarketInfo {
    /**
     * Information whether the market is enabled
     */
    @SerializedName("enabled")
    private BoolInt enabled;

    /**
     * Minimum price
     */
    @SerializedName("price_min")
    private Long priceMin;

    /**
     * Maximum price
     */
    @SerializedName("price_max")
    private Long priceMax;

    /**
     * Main market album ID
     */
    @SerializedName("main_album_id")
    private Integer mainAlbumId;

    /**
     * Contact person ID
     */
    @SerializedName("contact_id")
    private Integer contactId;

    @SerializedName("currency")
    private Currency currency;

    /**
     * Currency name
     */
    @SerializedName("currency_text")
    private String currencyText;

    public boolean isEnabled() {
        return enabled == BoolInt.YES;
    }

    public Long getPriceMin() {
        return priceMin;
    }

    public Long getPriceMax() {
        return priceMax;
    }

    public Integer getMainAlbumId() {
        return mainAlbumId;
    }

    public Integer getContactId() {
        return contactId;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getCurrencyText() {
        return currencyText;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceMin, priceMax, mainAlbumId, contactId, currencyText, currency, enabled);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketInfo marketInfo = (MarketInfo) o;
        return Objects.equals(enabled, marketInfo.enabled) &&
                Objects.equals(priceMin, marketInfo.priceMin) &&
                Objects.equals(priceMax, marketInfo.priceMax) &&
                Objects.equals(mainAlbumId, marketInfo.mainAlbumId) &&
                Objects.equals(contactId, marketInfo.contactId) &&
                Objects.equals(currency, marketInfo.currency) &&
                Objects.equals(currencyText, marketInfo.currencyText);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketInfo{");
        sb.append("enabled=").append(enabled);
        sb.append(", priceMin=").append(priceMin);
        sb.append(", priceMax=").append(priceMax);
        sb.append(", mainAlbumId=").append(mainAlbumId);
        sb.append(", contactId=").append(contactId);
        sb.append(", currency=").append(currency);
        sb.append(", currencyText='").append(currencyText).append("'");
        sb.append('}');
        return sb.toString();
    }
}
