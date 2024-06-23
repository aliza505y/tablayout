package com.example.whatsapp2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fragmentSupportManger : FragmentManager) :FragmentPagerAdapter(fragmentSupportManger,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


    val fragmentList = ArrayList<Fragment>()
    val titleList = ArrayList<String>()

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }

    fun addMyFragment(fragments:Fragment, title:String){
        fragmentList.add(fragments)
        titleList.add(title)
    }
}