package com.qizhou.jun8thclass.interfaces;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//mapper
public class UnsplashResponse {

    @SerializedName("id")
    public String id;

    @SerializedName("urls")
    public ImageUrls urls;

    @SerializedName("current_user_collections")
    public List<Collection> collections;

    public static class ImageUrls {
        @SerializedName("raw")
        public String raw;

        @SerializedName("regular")
        public String regular;
    }

    public static class Collection {
        @SerializedName("title")
        public String title;

        @SerializedName("id")
        public int id;
    }
}
