package com.example.a9weeks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a9weeks.databinding.FragmentReelsBinding


class Reels : Fragment() {
    lateinit var binding : FragmentReelsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReelsBinding.inflate(layoutInflater)
        return binding.root
    }
}