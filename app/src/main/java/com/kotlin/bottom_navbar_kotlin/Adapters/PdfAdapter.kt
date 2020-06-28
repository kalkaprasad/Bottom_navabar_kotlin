package com.kotlin.bottom_navbar_kotlin.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bottom_navbar_kotlin.R
import com.kotlin.bottom_navbar_kotlin.modelsclass.pdfData
import kotlin.coroutines.coroutineContext
import android.content.Context as contex

class PdfAdapter(val pdflist:ArrayList<pdfData>):RecyclerView.Adapter<PdfAdapter.ViewHolder>() {
    // this is the use for the CreateView Holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val  v= LayoutInflater.from(parent.context).inflate(R.layout.pdf_layout,parent,false)
        return ViewHolder(v)
    }

    // this will be return the pdflist size..
    override fun getItemCount(): Int {
        return pdflist.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val  pdfs: pdfData=pdflist[position]
        holder?.pdftitle?.text=pdfs.pdftitle
        holder.pdfurl.setOnClickListener { view ->
        }}

    class  ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView)
    {
val pdftitle=itemView.findViewById(R.id.pdf_title) as TextView // this is the our text view which are avialbe on pdf_layout
 val pdfurl=itemView.findViewById(R.id.read_pdf) as TextView
    }

}

