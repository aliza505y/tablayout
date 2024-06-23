package com.example.whatsapp2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class chatsadapter(val list: ArrayList<chatsDataClass>, val context: Context) :
    RecyclerView.Adapter<chatsadapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dpp = itemView.findViewById<CircleImageView>(R.id.profileIMG)
        val name = itemView.findViewById<TextView>(R.id.nameTv)
        val msg = itemView.findViewById<TextView>(R.id.messageTv)
        val time = itemView.findViewById<TextView>(R.id.timeTV)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): chatsadapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.chats_rv_design, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: chatsadapter.ViewHolder, position: Int) {
        val ty = list[position]
        holder.dpp.setImageResource(ty.profileImg)
        holder.name.text = ty.textview3
        holder.msg.text = ty.textview4
        holder.time.text = ty.textview5

    }

    override fun getItemCount(): Int {
        return list.size
    }


}