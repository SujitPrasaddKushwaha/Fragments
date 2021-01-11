package com.example.fragments.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    private val lstFragmentgs : ArrayList<Fragment>,
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
):FragmentStateAdapter(fragmentManager,lifecycle){
    override fun getItemCount(): Int {
        return lstFragmentgs.size
    }

    override fun createFragment(position: Int): Fragment {
        return lstFragmentgs[position]
    }

}