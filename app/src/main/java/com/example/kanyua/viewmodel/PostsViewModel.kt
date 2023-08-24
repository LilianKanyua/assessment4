package com.example.kanyua.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kanyua.models.Posts
import com.example.kanyua.repository.PostsRepository


class PostsViewModel : ViewModel() {
    val productsRepo = PostsRepository()
    val productsLiveData = MutableLiveData<List<Posts>>()
    val errorLiveData = MutableLiveData<String>()


//    fun fetchPosts() {
//        viewModelScope.launch {
//            val response = productsRepo.getPosts()
//            if (response.isSuccessful) {
//                productsLiveData.postValue(response.body()?.products)
//
//            } else {
//                errorLiveData.postValue(response.errorBody()?.string())
//            }
//        }
//
//    }
}