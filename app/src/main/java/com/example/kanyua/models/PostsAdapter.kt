package com.example.kanyua.models

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

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
         binding.tvId.text = currentProducts.id.toString()
     binding.tvDesc.text = currentProducts.description.toString()
      binding.tvRating.text = currentProducts.rating.toString()
      binding.tvPrice.text = currentProducts.price.toString()
      binding.tvCategory.text = currentProducts.category.toString()
       binding.tvTitle.text = currentProducts.title.toString()
       binding.tvStock.text = currentProducts.stock.toString()
    }
    //    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
//        var currentProducts = productsList.get(position)
//        var binding = holder.binding
////        binding.ivProducts.text = currentProcucts.thumbnail.toString()
//        binding.tvId.text = currentProducts.id.toString()
//        binding.tvDesc.text = currentProducts.description.toString()
//        binding.tvRating.text = currentProducts.rating.toString()
//        binding.tvPrice.text = currentProducts.price.toString()
//        binding.tvCategory.text = currentProducts.category.toString()
//        binding.tvTitle.text = currentProducts.title.toString()
//        binding.tvStock.text = currentProducts.stock.toString()
//


}

//class ProductsAdapter (var productsList: List<Procucts>): RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
//        var binding =
//            ProductsListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return ProductsViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
//        var currentProducts = productsList.get(position)
//        var binding = holder.binding
////        binding.ivProducts.text = currentProcucts.thumbnail.toString()
//        binding.tvId.text = currentProducts.id.toString()
//        binding.tvDesc.text = currentProducts.description.toString()
//        binding.tvRating.text = currentProducts.rating.toString()
//        binding.tvPrice.text = currentProducts.price.toString()
//        binding.tvCategory.text = currentProducts.category.toString()
//        binding.tvTitle.text = currentProducts.title.toString()
//        binding.tvStock.text = currentProducts.stock.toString()
//
//
//        Picasso
//            .get()
//            .load(currentProducts.thumbnail)
//            .transform(CropCircleTransformation())
//            .into(binding.ivProducts)
//
//
//    }
//
//    override fun getItemCount(): Int {
//        return productsList.size
//    }
//
//    //}
//    class ProductsViewHolder(var binding: ProductsListBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//
//    }
//}