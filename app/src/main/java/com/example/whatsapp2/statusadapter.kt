package com.example.whatsapp2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class statusadapter(val list: ArrayList<statusDataClass>, val context: Context) :
    RecyclerView.Adapter<statusadapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val statusimage = itemView.findViewById<ImageView>(R.id.statusProfileImg)
        val name = itemView.findViewById<TextView>(R.id.statusNameTv)
        val time = itemView.findViewById<TextView>(R.id.statusTimeTv)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): statusadapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.status_rv_design, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: statusadapter.ViewHolder, position: Int) {
        val ee = list[position]
        holder.statusimage.setImageResource(ee.imageview4)
        holder.name.text = ee.textview6
        holder.time.text = ee.textview7
    }

    override fun getItemCount(): Int {
        return list.size
    }

}