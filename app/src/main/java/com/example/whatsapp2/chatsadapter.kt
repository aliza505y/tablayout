package com.example.whatsapp2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class chatsadapter (val list:ArrayList<chatsDataClass>,val context: Context): RecyclerView.Adapter<chatsadapter.ViewHolder>() {
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val dpp= itemView.findViewById<ImageView>(R.id.imageview3)
        val t = itemView.findViewById<TextView>(R.id.textView3)
        val tt = itemView.findViewById<TextView>(R.id.textView4)
        val ttt = itemView.findViewById<TextView>(R.id.textView5)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): chatsadapter.ViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.calls_rv_design,parent,false)
    return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: chatsadapter.ViewHolder, position: Int) {
       val ty = list[position]
        holder.dpp.setImageResource(ty.imageview3)
        holder.t.text=ty.textview3
        holder.tt.text=ty.textview4
        holder.ttt.text=ty.textview5

    }

    override fun getItemCount(): Int {
        return list.size
    }


}