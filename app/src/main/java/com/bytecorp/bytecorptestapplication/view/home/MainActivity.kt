package com.bytecorp.bytecorptestapplication.view.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.bytecorp.bytecorptestapplication.R
import com.bytecorp.bytecorptestapplication.adapters.ViewPagerAdapter
import com.bytecorp.bytecorptestapplication.databinding.ActivityMainBinding
import com.bytecorp.bytecorptestapplication.view.base.BaseActivity
import com.bytecorp.bytecorptestapplication.view.profile.ProfileFragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private val binding: ActivityMainBinding by binding(R.layout.activity_main)
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this@MainActivity

        setUpPages()

    }

    private fun setUpPages() {
        val fragList = ArrayList<Fragment>()
        fragList.add(HomeFragment())
        fragList.add(ProfileFragment())
        viewPagerAdapter = ViewPagerAdapter(fragList, supportFragmentManager)
        viewPagerAdapter.notifyDataSetChanged()
        binding.viewPagerHome.adapter = viewPagerAdapter
        binding.tabLayoutHome.setupWithViewPager(binding.viewPagerHome)

        binding.tabLayoutHome.getTabAt(0)?.setIcon(R.drawable.ic_home_tab)
        binding.tabLayoutHome.getTabAt(1)?.setIcon(R.drawable.ic_profile_tab)

    }
}