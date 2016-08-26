package com.vk.api.sdk.objects.market.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * AddAlbumResponse object
 */
public class AddAlbumResponse {
    /**
     * Album ID
     */
    @SerializedName("market_album_id")
    private Integer marketAlbumId;

    public Integer getMarketAlbumId() {
        return marketAlbumId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketAlbumId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddAlbumResponse addAlbumResponse = (AddAlbumResponse) o;
        return Objects.equals(marketAlbumId, addAlbumResponse.marketAlbumId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddAlbumResponse{");
        sb.append("marketAlbumId=").append(marketAlbumId);
        sb.append('}');
        return sb.toString();
    }
}
