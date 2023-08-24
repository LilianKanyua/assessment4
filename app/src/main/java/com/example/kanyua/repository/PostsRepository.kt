package com.example.kanyua.repository

import com.example.kanyua.API.ApiClient
import com.example.kanyua.API.ApiInterface
import com.example.kanyua.models.PostsResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response


class PostsRepository {
    val apiClient = ApiClient.buildClient(ApiInterface::class.java)

    suspend fun getPosts() {
        return  withContext(Dispatchers.IO){
            apiClient.getPosts()
        }


    }
}