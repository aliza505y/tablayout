package com.example.whatsapp2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class chats : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_chats, container , false)
        val recyclerView=view.findViewById<RecyclerView>(R.id.recyclerView2)
        val list = ArrayList<chatsDataClass>()
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))
        list.add(chatsDataClass(R.drawable.swat5,"Madiha Iqbal","Hye! How are you?","5:20pm"))


        val adapter = chatsadapter(list,requireContext())
        recyclerView.adapter=adapter
        recyclerView.layoutManager=LinearLayoutManager(requireContext())
        return view.rootView

    }

}