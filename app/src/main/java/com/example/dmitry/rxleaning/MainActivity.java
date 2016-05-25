package com.example.dmitry.rxleaning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dmitry.rxleaning.view.BaseView;

public class MainActivity extends AppCompatActivity implements BaseView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

    }
}
