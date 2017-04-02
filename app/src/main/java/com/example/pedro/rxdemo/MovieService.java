package com.example.pedro.rxdemo;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by pedro on 01/04/2017.
 */

public interface MovieService {

    @GET("?")
    Observable<Movie> searchMovie(@Query("t") String title);
}