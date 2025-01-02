package com.example.supernativeapps

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter(val context: Context,val hobbies: List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val view =  LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val  hobby = hobbies[position]
        holder.setData(hobby,position)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData(hobby: Hobby?,pos: Int){
            itemView.titleTextView.text = hobby!!.title
            itemView.descriptionTextView.text = hobby!!.description
            itemView.cardImageView.setImageResource(R.drawable.man)
        } //https://youtu.be/HXz6618Zzn8?list=PLlxmoA0rQ-Lw5k_QCqVl3rsoJOnb_00UV&t=223
    }

}