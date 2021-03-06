package com.example.listapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setAdapter()
    }

    private fun setAdapter() {
        binding.recyclerView.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )
        binding.recyclerView.addItemDecoration(
            MarginItemDecoration(resources.getDimensionPixelSize(R.dimen.dp8))
        )
        binding.recyclerView.adapter = NewsAdapter(
            listOf(
                New("title1", "description1"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2"),
                New("title2", "description2")
            )
        )

    }

}