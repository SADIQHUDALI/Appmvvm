package com.sadiq.e_commersclone.network

import com.sadiq.e_commersclone.model.Products
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServices {

    @GET("/products")
    fun getAllProducts():Call<List<Products>>


}