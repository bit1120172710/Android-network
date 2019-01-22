package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {
    public boolean isStatus() {
        return status;
    }

    @SerializedName("success") private boolean status;

    public List<Feed> getFeeds() {
        return feeds;
    }

    @SerializedName("feeds") private List<Feed> feeds;

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json
}
