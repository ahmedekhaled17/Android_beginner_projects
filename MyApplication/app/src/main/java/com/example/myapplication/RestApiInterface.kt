package com.example.myapplication5

import retrofit2.Call
import retrofit2.http.GET

interface RestApiInterface {
    @GET("posts/1")
    fun getPost():Call<Post>


}