package com.bytecorp.bytecorptestapplication.view.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bytecorp.bytecorptestapplication.R
import com.bytecorp.bytecorptestapplication.adapters.PostsAdapter
import com.bytecorp.bytecorptestapplication.databinding.FragmentHomeBinding
import com.bytecorp.bytecorptestapplication.databinding.FragmentPostsBinding
import com.bytecorp.bytecorptestapplication.view.base.BaseFragment

class PostsFragment : BaseFragment() {

    lateinit var binding: FragmentPostsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = binding<FragmentPostsBinding>(inflater, R.layout.fragment_posts, container)
            .apply {
                lifecycleOwner = viewLifecycleOwner
            }
        setUpRecycler()
        return binding.root
    }

    private fun setUpRecycler() {
        val postsAdapter = PostsAdapter()
        binding.rvPosts.apply {
            adapter = postsAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }

}
