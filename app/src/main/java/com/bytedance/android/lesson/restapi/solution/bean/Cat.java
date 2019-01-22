package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    public String getUrl() {
        return url;
    }
    @Override
    public String toString()
    {
        return "url is \n"+url;
    }
    @SerializedName("url") private String url;
    // TODO-C1 (1) Implement your Cat Bean here according to the response json
}
