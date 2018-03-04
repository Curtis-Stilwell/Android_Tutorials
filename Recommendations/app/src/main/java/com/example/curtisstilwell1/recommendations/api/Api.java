package com.example.curtisstilwell1.recommendations.api;

import com.example.curtisstilwell1.recommendations.model.ActiveListings;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by curtisstilwell1 on 8/6/17.
 */

public class Api {

     @GET("/listings/active")
     void activeListings(@Query("includes") String inlucdes, Callback<ActiveListings>);

}
