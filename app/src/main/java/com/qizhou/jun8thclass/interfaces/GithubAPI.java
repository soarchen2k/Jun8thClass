package com.qizhou.jun8thclass.interfaces;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * https://api.github.com/users/soarchen2k
 */
public interface GithubAPI {
    @GET("users/soarchen2k")
    Call<GithubResponse> getUser();
}
