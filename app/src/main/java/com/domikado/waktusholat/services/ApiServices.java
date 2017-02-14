package com.domikado.waktusholat.services;
// Created by irwancannady (irwancannady@gmail.com) on 2/13/17 at 6:58 PM.

import com.domikado.waktusholat.model.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiServices {

    @GET("api/pray-times?&timezone=7&method=0")
    Call<Example> getData(@Query("address") String address,
                          @Query("year") String year,
                          @Query("month") String month,
                          @Query("day") String day);
}
