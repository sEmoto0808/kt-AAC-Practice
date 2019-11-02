package com.example.aacpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.aacpractice.databinding.FragmentMainBinding

/**
 * 各AACの画面への遷移用の画面
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMainBinding.inflate(inflater)
        binding.listener = this
        return binding.root
    }

    fun onClickBottomSheet() {
        findNavController().navigate(
            R.id.action_main_to_bottomSheet
        )
    }
}
