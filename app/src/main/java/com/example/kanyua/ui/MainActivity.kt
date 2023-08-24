package com.example.kanyua.ui

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.kanyua.R
import com.example.kanyua.databinding.ActivityMainBinding
import com.example.kanyua.models.Posts
import com.example.kanyua.models.PostsAdapter


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

   binding.rvProducts.adapter = productsAdapter
}


    override fun onResume() {
        super.onResume()
        postsViewModel.fetchPosts()
        postsViewMode
//        postsViewModel.fetchProducts()
//        postsViewModel.productsLiveData.observe(this, Observer { productList ->
//            var productsAdapter = ProductsAdapter(productList ?: emptyList())
//            binding.rvProducts.layoutManager = LinearLayoutManager(this)
//            binding.rvProducts.adapter = productsAdapter
//
//            Toast
//                .makeText(baseContext, "Fetched ${productList?.size}products", Toast.LENGTH_LONG)
//                .show()
//        })


//        getProducts()
    }
}













































//class MainActivity : AppCompatActivity() {
//    val productsViewModel: ProductsViewModel by viewModels()
//
//    lateinit var binding: ActivityMainBinding
//    lateinit var productsAdapter: ProductsAdapter
//    var productList: List<Procucts> = emptyList()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        productsAdapter = ProductsAdapter(emptyList())
//        binding.rvProducts.adapter = productsAdapter
//
//    }
//
//    override fun onResume() {
//        super.onResume()
//        productsViewModel.fetchProducts()
//        productsViewModel.productsLiveData.observe(this, Observer { productList ->
//            var productsAdapter = ProductsAdapter(productList ?: emptyList())
//            binding.rvProducts.layoutManager = LinearLayoutManager(this)
//            binding.rvProducts.adapter = productsAdapter
//
//            Toast
//                .makeText(baseContext, "Fetched ${productList?.size}products", Toast.LENGTH_LONG)
//                .show()
//        })
//
//
////        getProducts()
//    }
//}



//viewmodel
//class ProductsViewModel : ViewModel() {
//    val productsRepo = ProductRepository()
//    val productsLiveData = MutableLiveData<List<Procucts>>()
//    val errorLiveData = MutableLiveData<String>()
//
//
//    fun fetchProducts() {
//        viewModelScope.launch {
//            val response = productsRepo.getProducts()
//            if (response.isSuccessful) {
//                productsLiveData.postValue(response.body()?.products)
//
//            } else {
//                errorLiveData.postValue(response.errorBody()?.string())
//            }
//        }
//
//    }
//}


//repository


//class ProductRepository {
//    val apiClient = ApiClient.buildClient(ApiInterface::class.java)
//
//    suspend fun getProducts():Response<ProductsResponse>{
//        return  withContext(Dispatchers.IO){
//            apiClient.getProducts()
//        }
//
//
//    }
//}

//apiclient
//object ApiClient {
//    var retrofit = Retrofit.Builder()
//        .baseUrl("https://dummyjson.com/")
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//
//
//    fun <T> buildClient(apiInterface: Class<T>): T{
//        return retrofit.create(apiInterface)
//    }
//
//}


//API INTERFACE
//interface ApiInterface {
//    @GET("/product")
//    suspend fun getProducts(): Response <ProductsResponse>
//
//
//
//
//    @GET("/product/{id}")
//    suspend fun getProductById(@Path("id")productId:Int): Call<Procucts>


//PRODUCTS

//data class Procucts(
//    var id :Int,
//    var title:String,
//    var description: String,
//    var price:Double,
//    var rating :Double,
//    var stock:Int,
//    var category:String,
//    var thumbnail: String
//)

//PRODUCTSADAPTER
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

//PRODUCTSRESPONSE
//data class ProductsResponse(
//    var products :List<Procucts>,
//    var total :Int,
//    var skip:Int,
//    var limit:Int
//)


//PRODUCTS VIEWMODEL
//class ProductsViewModel :ViewModel() {
//    val productsRepo = ProductRepository()
//    val productsLiveData = MutableLiveData<List<Procucts>>()
//    val errorLiveData = MutableLiveData<String>()
//
//
//    fun fetchProducts() {
//        viewModelScope.launch {
//            val response = productsRepo.getProducts()
//            if (response.isSuccessful) {
//                productsLiveData.postValue(response.body()?.products)
//
//            } else {
//                errorLiveData.postValue(response.errorBody()?.string())
//            }
//        }
//
//    }
//}