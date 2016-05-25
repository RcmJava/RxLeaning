package com.example.dmitry.rxleaning.model.interactors;

import com.google.gson.JsonObject;

import rx.Observable;

/**
 * Created by Dmitry on 07.05.2016.
 */
public interface GetMarksInteractor {
    Observable<JsonObject> get();
}
