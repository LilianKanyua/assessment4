package com.example.kanyua.models

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kanyua.databinding.PostsListBinding
import com.squareup.picasso.Picasso

 class PostsAdapter(var postsList: List<Posts>):RecyclerView.Adapter<PostsAdapter.PostsViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PostsAdapter.PostsViewHolder {
        var binding = PostsListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  PostsViewHolder(binding)
    }


    override fun onBindViewHolder(holder: PostsAdapter.PostsViewHolder, position: Int) {
        var currentPosts = postsList.get(position)
        var binding = holder.binding
        binding.tvId.text = currentPosts.id.toString()
        binding.tvUserId.text = currentPosts.userId.toString()
        binding.tvTitle.text = currentPosts.title.toString()
        binding.tvBody.text = currentPosts.body.toString()



        Picasso
            .get()
            .into(binding.ivPosts)

    }


}

