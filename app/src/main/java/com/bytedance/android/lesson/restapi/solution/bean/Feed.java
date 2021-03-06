package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {

        public String getStudent_id() {
            return student_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public String getImage_url() {
            return image_url;
        }

        public String getVideo_url() {
            return video_url;
        }

        @SerializedName("student_id") private String student_id;
        @SerializedName("user_name") private String user_name;
        @SerializedName("image_url") private String image_url;
        @SerializedName("video_url") private String video_url;
@Override
    public String toString()
{
    return this.student_id+this.video_url;
}
    // TODO-C2 (1) Implement your Feed Bean here according to the response json
}
