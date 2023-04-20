package com.example.shopui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private var adapter : RecyclerView.Adapter<ShopRecyclerAdapter.MyHolder>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private lateinit var recyclerView : RecyclerView
    private val tabTitle = arrayOf("Public Shops","My Shops","Conversation")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = this.findViewById(R.id.recyclerView)
        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        adapter = ShopRecyclerAdapter()
        recyclerView.adapter = adapter

        val pager = findViewById<ViewPager2>(R.id.viewpagertwo)
        val t1 = findViewById<TabLayout>(R.id.tabLayout)
        pager.adapter = ShopAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(t1, pager){
                tab, position ->
            tab.text = tabTitle [position]
        }.attach()
    }
}