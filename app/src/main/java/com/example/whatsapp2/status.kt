package com.example.whatsapp2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class status : Fragment(){

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_calls , container,false)
        val statusRV= view.findViewById<RecyclerView>(R.id.recyclerView3)
        val status2Rv = view.findViewById<RecyclerView>(R.id.recyclerView4)

        val product=ArrayList<statusDataClass>()
        product.add(statusDataClass(R.drawable.swat6,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.s5,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.s6,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.s7,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.s8,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.ball,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.girl,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.image,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.coverimage,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.swat6,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.swat6,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.swat6,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.swat6,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.swat6,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.swat6,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.swat6,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.swat6,"Adiba shakeel","11:15AM"))
        product.add(statusDataClass(R.drawable.swat6,"Adiba shakeel","11:15AM"))

//        val adapter1=statusadapter(product , requireContext())
//        statusRV.adapter=adapter1
//        statusRV.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

        val adapter =statusadapter(product , requireContext())
        status2Rv.layoutManager=LinearLayoutManager(requireContext())
        status2Rv.adapter=adapter

        return view.rootView
    }
}