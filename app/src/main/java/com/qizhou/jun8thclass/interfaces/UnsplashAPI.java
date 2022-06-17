package com.qizhou.jun8thclass.interfaces;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UnsplashAPI {

    @GET("/photos/random")
//    Call<UnsplashResponse> getRandomPhoto(@Query("client_id") String key);
    Call<UnsplashResponse> getRandomPhoto();

    @GET("/photos/")
    Call<List<UnsplashResponse>> getListOfPhotos(@Query("order_by") String order);

}
