package com.bytecorp.bytecorptestapplication.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.bytecorp.bytecorptestapplication.R
import com.bytecorp.bytecorptestapplication.adapters.DealsAdapter
import com.bytecorp.bytecorptestapplication.databinding.FragmentHomeBinding
import com.bytecorp.bytecorptestapplication.databinding.FragmentLoginBinding
import com.bytecorp.bytecorptestapplication.view.base.BaseFragment

class HomeFragment : BaseFragment() , DealsAdapter.DealsClickCallback {

    lateinit var binding : FragmentHomeBinding
    lateinit var hotDealsAdapter: DealsAdapter
    lateinit var trendingDealsAdapter: DealsAdapter
    lateinit var dealsAdapter: DealsAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = binding<FragmentHomeBinding>(inflater, R.layout.fragment_home, container)
            .apply {
                lifecycleOwner = viewLifecycleOwner
            }

        binding.tvBack.setOnClickListener {
            activity?.onBackPressed()
        }

        setUpRecycler()
        return binding.root
    }

    private fun setUpRecycler() {
        hotDealsAdapter = DealsAdapter(this,"Hot Deals")
        trendingDealsAdapter = DealsAdapter(this,"Trending Deals")
        dealsAdapter = DealsAdapter(this,"Deals")


        binding.rvHotDeals.isNestedScrollingEnabled = false

        binding.rvHotDeals.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = hotDealsAdapter
        }
        binding.rvTrending.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = trendingDealsAdapter
        }
        binding.rvDeals.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = dealsAdapter
        }
    }

    override fun onDealClicked(type: String) {
        Toast.makeText(context, "You clicked $type", Toast.LENGTH_SHORT).show()
    }


}