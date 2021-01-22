package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class productAdapter (private val product: List<product>)
    : RecyclerView.Adapter<productAdapter.productViewHolder>() {
    class productViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return productViewHolder(view)
    }

    override fun onBindViewHolder(holder: productViewHolder, position: Int) {
        val pro = product[position]
        val currentUrl: String = pro.url

        Glide.with(holder.imageView.context)
            .load(currentUrl)
            .placeholder(R.drawable.ic_launcher_foreground)
            .centerCrop()
            .into(holder.imageView)
    }
    override fun getItemCount(): Int = product.size
}


