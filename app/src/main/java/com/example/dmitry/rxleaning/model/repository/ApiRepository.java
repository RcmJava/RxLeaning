package com.example.dmitry.rxleaning.model.repository;

import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

import rx.Observable;


public class ApiRepository implements IApiRepository {
    private RetrofitAPI api;

    ApiRepository(RetrofitAPI api) {
        this.api = api;
    }

    @Override
    public Observable<JsonObject> getMarks(String idShop) {
        final Map<String, String> map = new HashMap<>();

        map.put("action", "getMarks");
        map.put("idSource", idShop);

        return api.getAllMarks(map);
    }
}
