package com.example.kanyua.models


data class PostsResponse(
    var posts :List<Posts>,
    var total :Int,
    var skip:Int,
    var limit:Int
)
