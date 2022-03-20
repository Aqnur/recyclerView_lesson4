package com.example.listapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.listapp.databinding.ItemNewBinding

class NewsAdapter(private val list: List<New>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding: ItemNewBinding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.item_new,
                parent,
                false
            )
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder = holder as NewsViewHolder
        viewHolder.initContent(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class NewsViewHolder(var binding: ItemNewBinding) :
        RecyclerView.ViewHolder(binding.root) {

            fun initContent(data: New) {
//                binding.data = data
                binding.tvTitle.text = data.title
                binding.tvDescription.text = data.description
                binding.executePendingBindings()
            }

    }


}