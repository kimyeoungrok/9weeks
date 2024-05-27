package com.example.a9weeks

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService{
    private const val BASE_URL = "http://3.34.69.27"

    val retrofit:Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}