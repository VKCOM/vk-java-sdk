package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.queries.upload.UploadAppImageQuery;
import com.vk.api.sdk.queries.upload.UploadDocQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoMarketAlbumQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoMarketQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoMessageQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoOwnerCoverQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoOwnerQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoWallQuery;
import com.vk.api.sdk.queries.upload.UploadVideoQuery;

import java.io.File;
import java.io.InputStream;

/**
 * List of Upload methods
 */
public class Upload extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Upload(VkApiClient client) {
        super(client);
    }

    public UploadPhotoQuery photo(String uploadUrl, File file) {
        return new UploadPhotoQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoQuery photo(String uploadUrl, InputStream content) {
        return new UploadPhotoQuery(getClient(), uploadUrl, content);
    }

    public UploadPhotoMarketAlbumQuery photoMarketAlbum(String uploadUrl, File file) {
        return new UploadPhotoMarketAlbumQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoMarketAlbumQuery photoMarketAlbum(String uploadUrl, InputStream content) {
        return new UploadPhotoMarketAlbumQuery(getClient(), uploadUrl, content);
    }

    public UploadPhotoMarketQuery photoMarket(String uploadUrl, File file) {
        return new UploadPhotoMarketQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoMarketQuery photoMarket(String uploadUrl, InputStream content) {
        return new UploadPhotoMarketQuery(getClient(), uploadUrl, content);
    }

    public UploadPhotoMessageQuery photoMessage(String uploadUrl, File file) {
        return new UploadPhotoMessageQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoMessageQuery photoMessage(String uploadUrl, InputStream content) {
        return new UploadPhotoMessageQuery(getClient(), uploadUrl, content);
    }

    public UploadPhotoOwnerQuery photoOwner(String uploadUrl, File file) {
        return new UploadPhotoOwnerQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoOwnerQuery photoOwner(String uploadUrl, InputStream content) {
        return new UploadPhotoOwnerQuery(getClient(), uploadUrl, content);
    }

    public UploadPhotoOwnerCoverQuery photoOwnerCover(String uploadUrl, File file) {
        return new UploadPhotoOwnerCoverQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoOwnerCoverQuery photoOwnerCover(String uploadUrl, InputStream content) {
        return new UploadPhotoOwnerCoverQuery(getClient(), uploadUrl, content);
    }

    public UploadPhotoWallQuery photoWall(String uploadUrl, File file) {
        return new UploadPhotoWallQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoWallQuery photoWall(String uploadUrl, InputStream content) {
        return new UploadPhotoWallQuery(getClient(), uploadUrl, content);
    }

    public UploadVideoQuery video(String uploadUrl, File file) {
        return new UploadVideoQuery(getClient(), uploadUrl, file);
    }

    public UploadVideoQuery video(String uploadUrl, InputStream content) {
        return new UploadVideoQuery(getClient(), uploadUrl, content);
    }

    public UploadAppImageQuery appImage(String uploadUrl, File file) {
        return new UploadAppImageQuery(getClient(), uploadUrl, file);
    }

    public UploadAppImageQuery appImage(String uploadUrl, InputStream content) {
        return new UploadAppImageQuery(getClient(), uploadUrl, content);
    }

    public UploadDocQuery doc(String uploadUrl, File file) {
        return new UploadDocQuery(getClient(), uploadUrl, file);
    }

    public UploadDocQuery doc(String uploadUrl, InputStream content) {
        return new UploadDocQuery(getClient(), uploadUrl, content);
    }
}
