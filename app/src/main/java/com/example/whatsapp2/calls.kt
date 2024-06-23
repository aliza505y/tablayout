package com.example.whatsapp2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class calls :Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_calls, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView1)
        val content = ArrayList<callDataClass>()

        content.add(callDataClass(R.drawable.swat4,"Hamza Ali","Yesterday,3:17 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.img_1,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.img_1,"Ali Rehman","11 June8:15 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.swat4,"Hamza Ali","Yesterday,3:17 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.img_1,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.img_1,"Ali Rehman","11 June8:15 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.swat4,"Hamza Ali","Yesterday,3:17 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.img_1,"Ali Rehman","11 June8:15 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.swat6,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.swat5,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.image,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.swat6,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.img_1,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.image,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.swat4,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))
        content.add(callDataClass(R.drawable.resturant3,"Ume Aimen","17 June,7:13 pm",R.drawable.icon))

        val adapter2=calladapter(content , requireContext())
        recyclerView.adapter=adapter2
        recyclerView.layoutManager=LinearLayoutManager(requireContext())
        return view.rootView


    }

}