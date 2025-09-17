package com.example.lab_week03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val coffeeList = listOf<View>(
            view.findViewById(R.id.affogato),
            view.findViewById(R.id.americano),
            view.findViewById(R.id.latte),

            view.findViewById(R.id.espresso),
            view.findViewById(R.id.macchiato)
        )

        coffeeList.forEach { coffee ->
            val fragmentBundle = Bundle()
            fragmentBundle.putInt(COFFEE_ID, coffee.id)

            coffee.setOnClickListener {
                findNavController().navigate(R.id.coffee_id_action, fragmentBundle)
            }
        }
    }

    companion object {
        const val COFFEE_ID = "COFFEE_ID"
    }
}