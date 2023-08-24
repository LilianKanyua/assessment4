package com.example.kanyua.ui

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kanyua.R
import com.example.kanyua.databinding.ActivityMainBinding
import com.example.kanyua.models.Posts
import com.example.kanyua.models.PostsAdapter
import com.example.kanyua.viewmodel.PostsViewModel


class MainActivity : AppCompatActivity(){
    val postsViewModel : PostsViewModel by viewModels()
    lateinit var binding : ActivityMainBinding
    lateinit var postsAdapter: PostsAdapter
    var postList : List<Posts> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        postsAdapter = PostsAdapter(emptyList())
        binding.rvPosts.adapter=postsAdapter
    }
    override fun onResume() {
        super.onResume()



        postsViewModel.fetchPosts()
        postsViewModel.postsLiveData.observe(this, Observer { postsList ->
            var postsAdapter = PostsAdapter(postsList ?: emptyList())
            binding.rvPosts.layoutManager = LinearLayoutManager(this)
            binding.rvPosts.adapter = postsAdapter

            Toast
                .makeText(baseContext, "Fetched ${postsList?.size}posts", Toast.LENGTH_LONG)
                .show()
        })

}

//    getPosts()





    }

































































