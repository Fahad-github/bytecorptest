package com.bytecorp.bytecorptestapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bytecorp.bytecorptestapplication.R
import com.bytecorp.bytecorptestapplication.databinding.ItemDealsBinding

class DealsAdapter(val listener:DealsClickCallback,val type:String): RecyclerView.Adapter<DealsAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = 10

    inner class ItemViewHolder(
        private val parent: ViewGroup,
        private val binding: ItemDealsBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_deals,
            parent,
            false
        )
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(
        ) {
            binding.root.setOnClickListener { listener.onDealClicked(type) }
        }
    }

    interface DealsClickCallback{
        fun onDealClicked(type:String)
    }

}