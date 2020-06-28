package com.kotlin.bottom_navbar_kotlin.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bottom_navbar_kotlin.R
import com.kotlin.bottom_navbar_kotlin.modelsclass.alumni

class alumniAdapter(val alumilist:ArrayList<alumni>):RecyclerView.Adapter<alumniAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var view=LayoutInflater.from(parent.context).inflate(R.layout.alumni_layout,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
       return alumilist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val alumnipostion :alumni= alumilist[position] // this is the our alumni list where we put the postion of the viewholder
        holder.name.text =alumnipostion.name // this is the get name of the alumnipostion..
        holder.company.text= alumnipostion.company
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){


        var  name = itemView.findViewById(R.id.name) as TextView
        var company = itemView.findViewById(R.id.company) as TextView
    }


}