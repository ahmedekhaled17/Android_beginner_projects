package com.example.task5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.txt)
        var r = Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var restApiInterface = r.create(RestApiInterface::class.java)
        var callPost = restApiInterface.getPost()
        callPost.enqueue(object :Callback<Post>{
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                textView.setText(response.body().toString())
            }

            override fun onFailure(call: Call<Post>, t: Throwable) {
                textView.setText(t.message.toString())
            }

        })
    }
}