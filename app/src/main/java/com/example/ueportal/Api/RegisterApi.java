package com.example.ueportal.Api;

import com.example.ueportal.Models.RegisterModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RegisterApi {
        //192.168.100.14
        String BASE_URL = "https://192.168.100.14/api/controller/";

        @GET("index/8080")
        Call<List<RegisterModel>> getHeroes();

        @POST("create")
        Call<RegisterModel> insertRegisterData(@Body RegisterModel registerModel);
//        @GET("/users/{user}/repos")
//        Call<List<Hero>> reposForUser(@Path("user") String user);
    }


