package com.example.ueportal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {
//192.168.100.14
    String BASE_URL = "https://192.168.100.14:80/api/controller/";

    @GET("Index")
    Call<List<com.example.ueportal.Models.NotificationModel>> getHeroes();

    @POST("create")
    Call<Hero> insertData(@Body Hero hero);
}
