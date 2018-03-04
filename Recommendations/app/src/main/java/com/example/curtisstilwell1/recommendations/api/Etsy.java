package com.example.curtisstilwell1.recommendations.api;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

/**
 * Created by curtisstilwell1 on 8/6/17.
 */

public class Etsy {
    private static final String API_KEY = "rrwu4an5vcbb9igmban5xh0m";

    public static RequestInterceptor  getInterceptor(){

        return new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                request.addEncodedQueryParam("api_key",API_KEY);
            }
        };
    }


    private static Api getApi() {
        return new RestAdapter().Builder().
                setEndpoint("https://openapi.etsy.com/v2")
                .setRequestInterceptor(getInterceptor())
                .build()
                .create(Api.class);
    }

}
