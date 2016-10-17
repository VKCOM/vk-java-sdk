package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.queries.ReportReason;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.report method
 */
public class VideoReportQuery extends AbstractQueryBuilder<VideoReportQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param videoId value of "video id" parameter. Minimum is 0.
     */
    public VideoReportQuery(VkApiClient client, UserActor actor, int ownerId, int videoId) {
        super(client, "video.report", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        videoId(videoId);
    }

    /**
     * ID of the user or community that owns the video.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoReportQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Video ID.
     *
     * @param value value of "video id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoReportQuery videoId(int value) {
        return unsafeParam("video_id", value);
    }

    /**
     * Reason for the complaint
     *
     * @param value value of "reason" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoReportQuery reason(ReportReason value) {
        return unsafeParam("reason", value);
    }

    /**
     * Comment describing the complaint.
     *
     * @param value value of "comment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoReportQuery comment(String value) {
        return unsafeParam("comment", value);
    }

    /**
     * (If the video was found in search results.) Search query string.
     *
     * @param value value of "search query" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoReportQuery searchQuery(String value) {
        return unsafeParam("search_query", value);
    }

    @Override
    protected VideoReportQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("video_id", "owner_id", "access_token");
    }
}
