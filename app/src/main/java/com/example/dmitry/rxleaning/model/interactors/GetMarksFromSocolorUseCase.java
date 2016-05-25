package com.example.dmitry.rxleaning.model.interactors;

import com.example.dmitry.rxleaning.model.repository.ApiRepository;
import com.google.gson.JsonObject;

import rx.Observable;


public class GetMarksFromSocolorUseCase implements GetMarksInteractor {
    private final ApiRepository mRepository;

    public GetMarksFromSocolorUseCase(ApiRepository repository) {
        mRepository = repository;
    }

    @Override
    public Observable<JsonObject> get() {
        return mRepository.getMarks("1");
    }
}
