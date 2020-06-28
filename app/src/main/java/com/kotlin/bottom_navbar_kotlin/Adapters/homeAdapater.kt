package com.kotlin.bottom_navbar_kotlin.Adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bottom_navbar_kotlin.R
import com.kotlin.bottom_navbar_kotlin.modelsclass.home
import com.squareup.picasso.Picasso

class homeAdapater(val homelist:ArrayList<home>):RecyclerView.Adapter<homeAdapater.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // onCreateViewHolder create the View Holder on the  activiy of the layout  file
        val v = LayoutInflater.from(parent.context).inflate(R.layout.college_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
    return  homelist.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var homes : home = homelist[position]

        holder?.title?.text=homes.name



    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {
        val img = itemView.findViewById(R.id.homeimg) as ImageView
        val title = itemView.findViewById(R.id.hometitle) as TextView


    }

}