package com.example.whatsapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog.Calls
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTabs()

        // solved


    }
       private fun setTabs() {

           val adapter = ViewPagerAdapter(supportFragmentManager)
           adapter.addMyFragment(chats(),"Chats")
           adapter.addMyFragment(status(),"Status")
           adapter.addMyFragment(calls(),"Calls")

           val viewpager = findViewById<ViewPager>(R.id.viewpager)
           val tablayout = findViewById<TabLayout>(R.id.tablayout)

           viewpager.adapter = adapter
           tablayout.setupWithViewPager(viewpager)

       }

}