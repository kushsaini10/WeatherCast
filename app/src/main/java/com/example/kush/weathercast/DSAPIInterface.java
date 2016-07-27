package com.example.kush.weathercast;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by saini on 27-Jul-16.
 */
public interface DSAPIInterface {
    @GET("/28.612868,77.231099")
    Call<Today> getToday();
}
