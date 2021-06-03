package com.bytecorp.bytecorptestapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bytecorp.bytecorptestapplication.R
import com.bytecorp.bytecorptestapplication.databinding.ItemPostsBinding

class PostsAdapter: RecyclerView.Adapter<PostsAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

    }

    override fun getItemCount() = 10

    inner class ItemViewHolder(
        private val parent: ViewGroup,
        private val binding: ItemPostsBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_posts,
            parent,
            false
        )
    ) : RecyclerView.ViewHolder(binding.root) {

    }
}