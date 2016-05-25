package com.example.dmitry.rxleaning.presenter;

import com.example.dmitry.rxleaning.view.BaseView;


public interface BasePresenter<V extends BaseView> {
    void attachView(V view);
    void detachView();
}
