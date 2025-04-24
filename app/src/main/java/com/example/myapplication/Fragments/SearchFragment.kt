package com.example.myapplication.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.RecyclerViewListAdapter
import com.example.myapplication.databinding.FragmentSearchBinding
import com.example.myapplication.databinding.SearchItemBinding
import com.example.myapplication.models.IDCard

class SearchFragment : Fragment(R.layout.fragment_search) {

    lateinit var binding: FragmentSearchBinding

    lateinit var rvSearch: RecyclerViewListAdapter

    private val itemList = listOf(
        IDCard("Rohan", 24, "65498712364"),
        IDCard("Roy", 25, "12498712364"),
        IDCard("Ron", 23, "12345612364"),
        IDCard("sxva", 22, "12345678978"),
        IDCard("sxva2", 27, "00098712364"),
        IDCard("sxva3", 20, "01498712364"),
        IDCard("Roy", 25, "12498712364"),
        IDCard("Ron", 23, "12345612364"),
        IDCard("sxva", 22, "12345678978"),
        IDCard("sxva2", 27, "00098712364"),
        IDCard("sxva2", 27, "00098712364"),
        IDCard("sxva3", 20, "01498712364"),
        IDCard("Roy", 25, "12498712364"),
        IDCard("Ron", 23, "12345612364"),
        IDCard("sxva", 22, "12345678978"),
        IDCard("sxva2", 27, "00098712364"),
        IDCard("sxva2", 27, "00098712364"),
        IDCard("sxva3", 20, "01498712364"),
        IDCard("Roy", 25, "12498712364"),
        IDCard("Ron", 23, "12345612364"),
        IDCard("sxva", 22, "12345678978"),
        IDCard("sxva2", 27, "00098712364")
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        rvSearch = RecyclerViewListAdapter()
        searchRV.adapter = rvSearch
        searchRV.layoutManager = GridLayoutManager(requireContext(), 3)
        rvSearch.submitList(itemList)
    }

}