package com.example.myapplication.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.myapplication.R
import com.example.myapplication.adapters.ViewPagerAdapter
import com.example.myapplication.databinding.FragmentProfileBinding
import com.google.android.material.tabs.TabLayoutMediator

class ProfileFragment : Fragment() {
    private var _binding:FragmentProfileBinding?=null
    private val binding get() = _binding!!

    private val flist = listOf(
        FirstFragment(), SecondFragment()
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            if (isAdded){
                val viewPagerAdapter = ViewPagerAdapter(requireActivity(), flist)
                vp.adapter  = viewPagerAdapter

                val tlist = listOf(
                    ContextCompat.getDrawable(requireContext(),R.drawable.ic_home),
                    ContextCompat.getDrawable(requireContext(),R.drawable.ic_person),
                )

                TabLayoutMediator(tabLayout,vp){tab,position ->
                    tab.icon = tlist[position]

                }.attach()
            }
        }
    }
    companion object {
        @JvmStatic
        fun newInstance() = ProfileFragment()
    }
}