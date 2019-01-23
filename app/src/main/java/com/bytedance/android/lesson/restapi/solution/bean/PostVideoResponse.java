package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {
    public boolean isStatus() {
        return status;
    }

    @SerializedName("success") private boolean status;
    public Feed getFeeds() {
        return feed;
    }

    @SerializedName("item") private Feed feed;


    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
}
