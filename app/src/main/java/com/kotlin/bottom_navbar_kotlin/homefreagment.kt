
package com.kotlin.bottom_navbar_kotlin
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bottom_navbar_kotlin.Adapters.homeAdapater
import com.kotlin.bottom_navbar_kotlin.modelsclass.home

class homefreagment : Fragment() {

    lateinit var  recyclerView: RecyclerView
    lateinit var home: home
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_homefreagment, container, false)
        recyclerView=view.findViewById(R.id.home_recy) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL ,false)
        return view
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fetch()
    }



        private fun fetch() {

        var home=ArrayList<home>() // this is the our ArrayList of the home model class
        var adapter = homeAdapater(home)
        home.add(home("SBS","hello"))
        home.add(home("sbstech","hello"))
        home.add(home("sbspoly","hello"))
        home.add(home("united","hello"))
        home.add(home("hbti","hello"))
        home.add(home("rmst","hello"))
        home.add(home("sambhunath","hello"))
        recyclerView.adapter = adapter
    }



}
