package com.example.gunmunity;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface testservice {
    @GET("todos/1")
    public Call<JsonObject> getdata();
}
