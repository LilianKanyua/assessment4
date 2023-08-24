package com.example.kanyua.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kanyua.models.Posts
import com.example.kanyua.repository.PostsRepository
import kotlinx.coroutines.launch


class PostsViewModel : ViewModel() {
    val postsRepo = PostsRepository()
    val postsLiveData = MutableLiveData<List<Posts>>()
    val errorLiveData = MutableLiveData<String>()



    fun fetchPosts() {
        viewModelScope.launch {
            val response = fetchPosts()
            if (response.isSuccessful) {
                postsLiveData.postValue(response.body()?.posts)

            } else {
                errorLiveData.postValue(response.errorBody()?.string())
            }
        }

    }
}