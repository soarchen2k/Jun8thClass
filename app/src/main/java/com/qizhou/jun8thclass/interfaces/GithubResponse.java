package com.qizhou.jun8thclass.interfaces;

import com.google.gson.annotations.SerializedName;

// mapper
public class GithubResponse {

    @SerializedName("avatar_url")
    public String url;

    @SerializedName("id")
    public int id;

    @SerializedName("name")
    public String name;
}
