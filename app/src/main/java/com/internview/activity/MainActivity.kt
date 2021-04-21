package com.internview.activity

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.CustomAdapter
import com.internview.R
import com.internview.activity.MainActivity

class MainActivity : AppCompatActivity()
{
    private val itemsList = ArrayList<String>()
    private lateinit var customAdapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "RecyclerView"

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        customAdapter = CustomAdapter(itemsList)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = customAdapter
        prepareItems()
    }
    private fun prepareItems()
    {
        itemsList.add("Item 1")
        itemsList.add("Item 2")
        itemsList.add("Item 3")
        itemsList.add("Item 4")
        itemsList.add("Item 5")
        itemsList.add("Item 6")
        itemsList.add("Item 7")
        itemsList.add("Item 8")
        itemsList.add("Item 9")
        itemsList.add("Item 10")
        itemsList.add("Item 11")
        itemsList.add("Item 12")
        itemsList.add("Item 13")
        customAdapter.notifyDataSetChanged()
    }
}