package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.fragments.adapter.ViewPagerAdapter
import com.example.fragments.fragments.AreaFragment
import com.example.fragments.fragments.SumFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabLayoutActivity : AppCompatActivity() {

    private lateinit var lstTile : ArrayList<String>
    private lateinit var lstFraments : ArrayList<Fragment>
    private lateinit var viewPager : ViewPager2
    private lateinit var tabLayout : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)

        populateList()
        val adapter = ViewPagerAdapter(lstFraments,supportFragmentManager,lifecycle)
        viewPager.adapter = adapter
        TabLayoutMediator(tabLayout,viewPager){
            tab, position ->
            tab.text = lstTile[position]
        }.attach()
    }

    private fun populateList() {
        lstTile = ArrayList<String>()
        lstTile.add("Sum")
        lstTile.add("Area of Circle")
        lstFraments = ArrayList<Fragment>()
        lstFraments.add(SumFragment())
        lstFraments.add(AreaFragment())
    }
}