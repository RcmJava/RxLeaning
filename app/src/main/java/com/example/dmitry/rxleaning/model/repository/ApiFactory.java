package com.example.dmitry.rxleaning.model.repository;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiFactory {
    private static final int CONNECT_TIMEOUT = 15;
    private static final int WRITE_TIMEOUT = 60;
    private static final int TIMEOUT = 60;

    public static final String API_BASE_URL = "http://your.api-base.url";
    public static final String MAIN_TEST_SERVER_URL = "http://lk.mirlk.ru/test.service.json.php";


    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(MAIN_TEST_SERVER_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient
                .build()).build();
        return retrofit.create(serviceClass);
    }
}
