package com.angesh.cvbuilderapplicationassignment6.ui.main

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.angesh.cvbuilderapplicationassignment6.ui.aboutMe.AboutMeFragment
import com.angesh.cvbuilderapplicationassignment6.ui.contact.ContactFragment
import com.angesh.cvbuilderapplicationassignment6.ui.home.HomeFragment
import com.angesh.cvbuilderapplicationassignment6.ui.work.WorkFragment

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 4 // fixed item size, we have tab item is 4

    override fun createFragment(position: Int): Fragment {

        //creating fragment object according to position
        val fragment: Fragment = when(position) {
            0 -> HomeFragment.newInstance()

            1 -> AboutMeFragment.newInstance()

            2 -> WorkFragment.newInstance()

            3 -> ContactFragment.newInstance()

            else -> HomeFragment.newInstance()
        }

        return fragment
    }

}