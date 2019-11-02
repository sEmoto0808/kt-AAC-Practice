package com.example.aacpractice.bottomsheet


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.aacpractice.R
import com.example.aacpractice.databinding.FragmentBottomSheetPracticeBinding

/**
 * BottomSheetを使ってみる。
 */
class BottomSheetPracticeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentBottomSheetPracticeBinding.inflate(inflater)
        return binding.root
    }
}
