package com.irakestinad.datateman

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {
        private val JUMLAHMENU = 3

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {return MyFriendFragment()}
            1 -> {return GithubFragment()}
            2 -> {return ProfileFragment()}
            else -> {return GithubFragment()}
        }
    }

    override fun getItemCount(): Int {
        return JUMLAHMENU
    }
}

