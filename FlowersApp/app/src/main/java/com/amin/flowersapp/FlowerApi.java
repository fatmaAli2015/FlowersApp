package com.amin.flowersapp;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Senior Steps on 8/12/2017.
 */

public interface FlowerApi {

    @GET("feeds/flowers.json")
    Call<ArrayList<Flower>> getFlowers();
}
