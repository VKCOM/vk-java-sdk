package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.stories.Story;
import com.vk.api.sdk.queries.upload.*;

import java.io.File;

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

    public UploadPhotoQuery photo(String uploadUrl, byte[] file) {
        return new UploadPhotoQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoMarketAlbumQuery photoMarketAlbum(String uploadUrl, File file) {
        return new UploadPhotoMarketAlbumQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoMarketAlbumQuery photoMarketAlbum(String uploadUrl, byte[] file) {
        return new UploadPhotoMarketAlbumQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoMarketQuery photoMarket(String uploadUrl, File file) {
        return new UploadPhotoMarketQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoMarketQuery photoMarket(String uploadUrl, byte[] file) {
        return new UploadPhotoMarketQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoMessageQuery photoMessage(String uploadUrl, File file) {
        return new UploadPhotoMessageQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoMessageQuery photoMessage(String uploadUrl, byte[] file) {
        return new UploadPhotoMessageQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoOwnerQuery photoOwner(String uploadUrl, File file) {
        return new UploadPhotoOwnerQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoOwnerQuery photoOwner(String uploadUrl, byte[] file) {
        return new UploadPhotoOwnerQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoOwnerCoverQuery photoOwnerCover(String uploadUrl, File file) {
        return new UploadPhotoOwnerCoverQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoOwnerCoverQuery photoOwnerCover(String uploadUrl, byte[] file) {
        return new UploadPhotoOwnerCoverQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoWallQuery photoWall(String uploadUrl, File file) {
        return new UploadPhotoWallQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoWallQuery photoWall(String uploadUrl, byte[] file) {
        return new UploadPhotoWallQuery(getClient(), uploadUrl, file);
    }

    public UploadVideoQuery video(String uploadUrl, File file) {
        return new UploadVideoQuery(getClient(), uploadUrl, file);
    }

    public UploadVideoQuery video(String uploadUrl, byte[] file) {
        return new UploadVideoQuery(getClient(), uploadUrl, file);
    }

    public UploadAppImageQuery appImage(String uploadUrl, File file) {
        return new UploadAppImageQuery(getClient(), uploadUrl, file);
    }

    public UploadAppImageQuery appImage(String uploadUrl, byte[] file) {
        return new UploadAppImageQuery(getClient(), uploadUrl, file);
    }

    public UploadDocQuery doc(String uploadUrl, File file) {
        return new UploadDocQuery(getClient(), uploadUrl, file);
    }

    public UploadDocQuery doc(String uploadUrl, byte[] file) {
        return new UploadDocQuery(getClient(), uploadUrl, file);
    }

    public Story photoStory(String uploadUrl, File file) throws ClientException, ApiException {
        return new UploadPhotoStoryQuery(getClient(), uploadUrl, file).execute();
    }

    public Story photoStory(String uploadUrl, byte[] file) throws ClientException, ApiException {
        return new UploadPhotoStoryQuery(getClient(), uploadUrl, file).execute();
    }

    public Story videoStory(String uploadUrl, File file) throws ClientException, ApiException {
        return new UploadVideoStoryQuery(getClient(), uploadUrl, file).execute();
    }

    public Story videoStory(String uploadUrl, byte[] file) throws ClientException, ApiException {
        return new UploadVideoStoryQuery(getClient(), uploadUrl, file).execute();
    }
}
