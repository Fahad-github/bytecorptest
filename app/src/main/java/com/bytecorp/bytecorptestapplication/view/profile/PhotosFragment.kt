package com.bytecorp.bytecorptestapplication.view.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bytecorp.bytecorptestapplication.R
import com.bytecorp.bytecorptestapplication.adapters.PicturesAdapter
import com.bytecorp.bytecorptestapplication.adapters.PostsAdapter
import com.bytecorp.bytecorptestapplication.databinding.FragmentPhotosBinding
import com.bytecorp.bytecorptestapplication.databinding.FragmentPostsBinding
import com.bytecorp.bytecorptestapplication.view.base.BaseFragment


class PhotosFragment : BaseFragment() {

    lateinit var binding: FragmentPhotosBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        binding = binding<FragmentPhotosBinding>(inflater, R.layout.fragment_photos, container)
            .apply {
                lifecycleOwner = viewLifecycleOwner
            }
        setUpRecycler()
        return binding.root
    }

    private fun setUpRecycler() {
        val picturesAdapter = PicturesAdapter()
        binding.rvPictures.apply {
            adapter = picturesAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }
}