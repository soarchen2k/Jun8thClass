package com.qizhou.jun8thclass;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.qizhou.jun8thclass.interfaces.UnsplashAPI;
import com.qizhou.jun8thclass.interfaces.UnsplashClient;
import com.qizhou.jun8thclass.interfaces.UnsplashResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private UnsplashResponse data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image);
        TextView textView = findViewById(R.id.url);

//        GithubAPI githubAPI = new GithubClient().create();
//        Call<GithubResponse> call = githubAPI.getUser();
//
//        Callback<GithubResponse> listener = new Callback<GithubResponse>() {
//            @Override
//            public void onResponse(Call<GithubResponse> call, Response<GithubResponse> response) {
//                GithubResponse body = response.body();
//                Log.d("TESTTEST", body.url);
//                Glide.with(getApplicationContext()).load(body.url).into(imageView);
//                textView.setText(body.url);
//            }
//
//            @Override
//            public void onFailure(Call<GithubResponse> call, Throwable t) {
//
//            }
//        };
//
//        call.enqueue(listener);

        UnsplashAPI unsplashAPI = new UnsplashClient().build();
        Call<UnsplashResponse> call = unsplashAPI.getRandomPhoto();

        call.enqueue(new Callback<UnsplashResponse>() {
            @Override
            public void onResponse(Call<UnsplashResponse> call, Response<UnsplashResponse> response) {
                UnsplashResponse body = response.body();
                data = body;
                Glide.with(getApplicationContext()).load(body.urls.raw).into(imageView);
            }

            @Override
            public void onFailure(Call<UnsplashResponse> call, Throwable t) {

            }
        });

        // Valid values: latest, oldest, popular, views, downloads; default: latest
//        Call<List<UnsplashResponse>> call = unsplashAPI.getListOfPhotos("popular");
//
//        call.enqueue(new Callback<List<UnsplashResponse>>() {
//            @Override
//            public void onResponse(Call<List<UnsplashResponse>> call, Response<List<UnsplashResponse>> response) {
//                List<UnsplashResponse> body = response.body();
////                data = body;
////                Glide.with(getApplicationContext()).load(body.get(0).urls.raw).into(imageView);
//            }
//
//            @Override
//            public void onFailure(Call<List<UnsplashResponse>> call, Throwable t) {
//
//            }
//        });

        System.out.println();
    }
}