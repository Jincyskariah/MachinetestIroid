package com.example.machinetestiroid.retrofit;

import com.example.machinetestiroid.model.Categories;

import retrofit2.Call;
import retrofit2.http.GET;

    public interface Apis {
        @GET("friday/index.php?route=api/common/getCategories")
        Call<Categories> getcategories();

    }


