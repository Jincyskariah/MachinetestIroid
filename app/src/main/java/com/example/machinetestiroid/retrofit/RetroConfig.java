package com.example.machinetestiroid.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroConfig {
    public  Apis getApis(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://iroidtechnologies.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Apis apis=retrofit.create(Apis.class);
        return apis;
    }
}
