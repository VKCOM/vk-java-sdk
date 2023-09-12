package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.queries.upload.*;

import java.io.File;
import java.util.Map;

import static java.util.Collections.singletonMap;

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
        return new UploadPhotoQuery(getClient(), uploadUrl, singletonMap("photo", file));
    }

    public UploadPhotoQuery photo(String uploadUrl, Map<String, File> files) {
        return new UploadPhotoQuery(getClient(), uploadUrl, files);
    }

    public UploadPhotoStringQuery photoAsString(String uploadUrl, File file) {
        return new UploadPhotoStringQuery(getClient(), uploadUrl, singletonMap("photo", file));
    }

    public UploadPhotoStringQuery photoAsString(String uploadUrl, Map<String, File> files) {
        return new UploadPhotoStringQuery(getClient(), uploadUrl, files);
    }

    public UploadPhotoMarketAlbumQuery photoMarketAlbum(String uploadUrl, File file) {
        return new UploadPhotoMarketAlbumQuery(getClient(), uploadUrl, singletonMap("photo", file));
    }

    public UploadPhotoMarketAlbumQuery photoMarketAlbum(String uploadUrl, Map<String, File> files) {
        return new UploadPhotoMarketAlbumQuery(getClient(), uploadUrl, files);
    }

    public UploadPhotoMarketQuery photoMarket(String uploadUrl, File file) {
        return new UploadPhotoMarketQuery(getClient(), uploadUrl, singletonMap("photo", file));
    }

    public UploadPhotoMarketQuery photoMarket(String uploadUrl, Map<String, File> files) {
        return new UploadPhotoMarketQuery(getClient(), uploadUrl, files);
    }

    public UploadPhotoMessageQuery photoMessage(String uploadUrl, File file) {
        return new UploadPhotoMessageQuery(getClient(), uploadUrl, singletonMap("photo", file));
    }

    public UploadPhotoMessageQuery photoMessage(String uploadUrl, Map<String, File> files) {
        return new UploadPhotoMessageQuery(getClient(), uploadUrl, files);
    }

    public UploadPhotoOwnerQuery photoOwner(String uploadUrl, File file) {
        return new UploadPhotoOwnerQuery(getClient(), uploadUrl, singletonMap("photo", file));
    }

    public UploadPhotoOwnerQuery photoOwner(String uploadUrl, Map<String, File> files) {
        return new UploadPhotoOwnerQuery(getClient(), uploadUrl, files);
    }

    public UploadPhotoOwnerCoverQuery photoOwnerCover(String uploadUrl, File file) {
        return new UploadPhotoOwnerCoverQuery(getClient(), uploadUrl, singletonMap("photo", file));
    }

    public UploadPhotoOwnerCoverQuery photoOwnerCover(String uploadUrl, Map<String, File> files) {
        return new UploadPhotoOwnerCoverQuery(getClient(), uploadUrl, files);
    }

    public UploadPhotoWallQuery photoWall(String uploadUrl, File file) {
        return new UploadPhotoWallQuery(getClient(), uploadUrl, singletonMap("photo", file));
    }

    public UploadPhotoWallQuery photoWall(String uploadUrl, Map<String, File> files) {
        return new UploadPhotoWallQuery(getClient(), uploadUrl, files);
    }

    public UploadVideoQuery video(String uploadUrl) {
        return new UploadVideoQuery(getClient(), uploadUrl, null);
    }

    public UploadVideoQuery video(String uploadUrl, File file) {
        if (file != null) {
            return new UploadVideoQuery(getClient(), uploadUrl, singletonMap("video_file", file));
        } else {
            return video(uploadUrl);
        }
    }

    public UploadVideoQuery video(String uploadUrl, Map<String, File> files) {
        return new UploadVideoQuery(getClient(), uploadUrl, files);
    }

    public UploadVideoExternalQuery videoExternal(String uploadUrl) {
        return new UploadVideoExternalQuery(getClient(), uploadUrl);
    }

    public UploadAppImageQuery appImage(String uploadUrl, File file) {
        return new UploadAppImageQuery(getClient(), uploadUrl, singletonMap("image", file));
    }

    public UploadAppImageQuery appImage(String uploadUrl, Map<String, File> files) {
        return new UploadAppImageQuery(getClient(), uploadUrl, files);
    }

    public UploadDocQuery doc(String uploadUrl, File file) {
        return new UploadDocQuery(getClient(), uploadUrl, singletonMap("file", file));
    }

    public UploadDocQuery doc(String uploadUrl, Map<String, File> files) {
        return new UploadDocQuery(getClient(), uploadUrl, files);
    }

    public UploadPhotoStoryQuery photoStory(String uploadUrl, File file) {
        return new UploadPhotoStoryQuery(getClient(), uploadUrl, singletonMap("file", file));
    }

    public UploadPhotoStoryQuery photoStory(String uploadUrl, Map<String, File> files) {
        return new UploadPhotoStoryQuery(getClient(), uploadUrl, files);
    }

    public UploadVideoStoryQuery videoStory(String uploadUrl, File file) {
        return new UploadVideoStoryQuery(getClient(), uploadUrl, singletonMap("video_file", file));
    }

    public UploadVideoStoryQuery videoStory(String uploadUrl, Map<String, File> files) {
        return new UploadVideoStoryQuery(getClient(), uploadUrl, files);
    }
}
