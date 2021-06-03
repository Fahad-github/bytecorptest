package com.bytecorp.bytecorptestapplication.adapters

import android.transition.Slide
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bytecorp.bytecorptestapplication.R
import com.bytecorp.bytecorptestapplication.databinding.ItemPhotosBinding
import com.denzcoskun.imageslider.models.SlideModel

class PicturesAdapter : RecyclerView.Adapter<PicturesAdapter.ItemViewHolder>() {

    lateinit var binding: ItemPhotosBinding

    private val imageList = arrayListOf(
        SlideModel("https://bit.ly/2YoJ77H"),
        SlideModel("https://bit.ly/2BteuF2"),
        SlideModel("https://bit.ly/3fLJf72")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_photos,
            parent,
            false
        )
        return ItemViewHolder(parent, binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(imageList = imageList)
    }

    override fun getItemCount() = 10

    inner class ItemViewHolder(
        private val parent: ViewGroup,
        private val binding: ItemPhotosBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_photos,
            parent,
            false
        )
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(imageList: ArrayList<SlideModel>) {
            binding.imageSlider.setImageList(imageList)
        }
    }
}