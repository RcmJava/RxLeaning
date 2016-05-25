package com.example.dmitry.rxleaning.model.repository;

import com.google.gson.JsonObject;

import rx.Observable;


public interface IApiRepository {
    Observable<JsonObject> getMarks(String idShop);
}
