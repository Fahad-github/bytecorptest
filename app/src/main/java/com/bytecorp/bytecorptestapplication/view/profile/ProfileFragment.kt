package com.bytecorp.bytecorptestapplication.view.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bytecorp.bytecorptestapplication.R
import com.bytecorp.bytecorptestapplication.databinding.FragmentProfileBinding
import com.bytecorp.bytecorptestapplication.adapters.PicturesAdapter
import com.bytecorp.bytecorptestapplication.adapters.PostsAdapter
import com.bytecorp.bytecorptestapplication.adapters.ViewPagerAdapter
import com.bytecorp.bytecorptestapplication.view.base.BaseFragment
import com.bytecorp.bytecorptestapplication.view.home.HomeFragment

class ProfileFragment : BaseFragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = binding<FragmentProfileBinding>(inflater, R.layout.fragment_profile, container)
            .apply {
                lifecycleOwner = viewLifecycleOwner
            }
        setUpTabs()

        binding.tvLogout.setOnClickListener {
            activity?.onBackPressed()
        }

        return binding.root
    }

    private fun setUpTabs() {
        val fragList = ArrayList<Fragment>()
        fragList.add(PostsFragment())
        fragList.add(PhotosFragment())
        val viewPagerAdapter  = ViewPagerAdapter(fragList, childFragmentManager)
        viewPagerAdapter.notifyDataSetChanged()
        binding.viewPagerProfile.adapter = viewPagerAdapter
        binding.tabLayoutProfile.setupWithViewPager(binding.viewPagerProfile)
        binding.tabLayoutProfile.getTabAt(0)?.text = "Post"
        binding.tabLayoutProfile.getTabAt(1)?.text = "Photos"
    }


}