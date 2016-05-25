package com.example.dmitry.rxleaning.model.repository;

import com.google.gson.JsonObject;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;


public interface RetrofitAPI {

    @FormUrlEncoded
    @POST
    Observable<JsonObject> getAllMarks(@FieldMap Map<String, String> map);
}
