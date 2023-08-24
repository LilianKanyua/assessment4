package com.example.kanyua.API

import com.example.kanyua.models.Posts
import com.example.kanyua.models.PostsResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiInterface {
    @GET("/post")
    suspend fun getPosts(): Response<PostsResponse>


    @GET("/post/{id}")
    suspend fun getPostById(@Path("id") postsId: Int): Call<Posts>
}










