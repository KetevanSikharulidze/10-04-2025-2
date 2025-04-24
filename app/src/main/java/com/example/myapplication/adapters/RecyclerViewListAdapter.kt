package com.example.myapplication.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.SearchItemBinding
import com.example.myapplication.models.IDCard

class RecyclerViewListAdapter : ListAdapter<IDCard,RecyclerViewListAdapter.Holder>(Comparator()) {

    class Holder(itemView : View) : RecyclerView.ViewHolder(itemView){
        private val binding = SearchItemBinding.bind(itemView)
        fun bind(item : IDCard) = with(binding){
            searchItemTV.text = item.name
        }
    }

    class Comparator():  DiffUtil.ItemCallback<IDCard>() {
        override fun areItemsTheSame(oldItem: IDCard, newItem: IDCard): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: IDCard, newItem: IDCard): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.search_item,parent,false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(getItem(position))
    }

}