package com.kotlin.bottom_navbar_kotlin


import android.app.ActionBar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.view.SupportActionModeWrapper
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bottom_navbar_kotlin.Adapters.alumniAdapter
import com.kotlin.bottom_navbar_kotlin.modelsclass.alumni


class collegeFragement : Fragment() {

    lateinit var  recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        var view = inflater.inflate(R.layout.fragment_college_fragement, container, false)
        recyclerView = view.findViewById(R.id.alumini_rec) as  RecyclerView

        return  view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fetchdata()
    }

    private fun fetchdata() {

        var data = ArrayList<alumni>()  // first of fall we declaire the ArrayList of the ModelClass
        var adapter = alumniAdapter(data) // initlise the Adapter class

        // next is add the data into the model class
        data.add(alumni("Kalka prasad","Infosyes"))
        data.add(alumni("Karan pratap singh","Microsoft"))
        data.add(alumni("pooja","Softpro"))
        data.add(alumni("komal","wipro"))
        data.add(alumni("ritika","accenture"))

        /// in the last add the all model class data into the set the recvliview
        recyclerView.adapter=adapter

    }

}
