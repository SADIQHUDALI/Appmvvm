package com.sadiq.e_commersclone.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sadiq.e_commersclone.model.Products
import com.sadiq.e_commersclone.network.RetrofitInstance
import com.sadiq.e_commersclone.network.RetrofitServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel : ViewModel() {

    val products = MutableLiveData<Products>()

    fun getProducts() {
        val retrofitService =
            RetrofitInstance.getRetrofitInstance().create(RetrofitServices::class.java)
        retrofitService.getAllProducts().enqueue(object : Callback<List<Products>> {
            override fun onResponse(
                call: Call<List<Products>>,
                response: Response<List<Products>>,
            ) {
                response.body()
                println("text"+response.message())
            }

            override fun onFailure(call: Call<List<Products>>, t: Throwable) {
                t.message
                println("failled"+t.message)
            }

        })


    }

}