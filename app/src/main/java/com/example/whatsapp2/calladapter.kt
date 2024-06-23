package com.example.whatsapp2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class calladapter (val mlist: ArrayList<callDataClass> , val context: Context):RecyclerView.Adapter<calladapter.ViewHolder>(){
inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val profimage = itemView.findViewById<ImageView>(R.id.imageview1)
    val textt = itemView.findViewById<TextView>(R.id.textView1)
    val texttt = itemView.findViewById<TextView>(R.id.textview2)
    val image = itemView.findViewById<ImageView>(R.id.imageview2)
}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): calladapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.calls_rv_design,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: calladapter.ViewHolder, position: Int) {
     val model = mlist[position]
        holder.profimage.setImageResource(model.imageView1)
        holder.textt.text=model.textview1
        holder.texttt.text=model.textview2
        holder.image.setImageResource(model.imageview2)
    }

    override fun getItemCount(): Int {
         return mlist.size

    }


}