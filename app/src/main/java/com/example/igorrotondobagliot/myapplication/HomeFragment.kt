package com.example.igorrotondobagliot.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnGo.setOnClickListener { v ->
            val args = Bundle().apply {
                putParcelable("person", Person("Igor Rotondo Bagliotti", 23))
            }
            v.findNavController().navigate(R.id.action_homeFragment_to_completeFragment, args)
        }
    }
}