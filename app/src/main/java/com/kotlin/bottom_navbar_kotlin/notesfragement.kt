package com.kotlin.bottom_navbar_kotlin
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bottom_navbar_kotlin.Adapters.PdfAdapter
import com.kotlin.bottom_navbar_kotlin.modelsclass.pdfData


private val View.setOnRefreshListener: Unit
    get() {}

@Suppress("UNREACHABLE_CODE")

class notesfragement : Fragment() {

    lateinit var recyclerView: RecyclerView
    var refreshTimes = 0
    companion object {

        fun newInstance(): notesfragement {
            return notesfragement()
        }

    }
    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(R.layout.fragment_notesfragement,
            container, false)
        recyclerView =view.findViewById(R.id.notes_recyleview) as RecyclerView // this is the declairetion of recyview
        recyclerView.layoutManager = LinearLayoutManager(activity)
        return  view
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
            setdata() //
    }
    private fun setdata() {
        var pdfdata=ArrayList<pdfData>()
        //  this is the declairtion of the Arraylist of the  our model class
        val adapter = PdfAdapter(pdfdata)
        pdfdata.add(pdfData("Java full course", "Ranchi Jharkhand"))
        pdfdata.add(pdfData("Python course", "Ranchi Jharkhand"))
        pdfdata.add(pdfData("Nodes js", "Ranchi Jharkhand"))
        pdfdata.add(pdfData("Java full course", "Ranchi Jharkhand"))
        pdfdata.add(pdfData("Python course", "Ranchi Jharkhand"))
        pdfdata.add(pdfData("Nodes js", "Ranchi Jharkhand"))
        pdfdata.add(pdfData("Java full course", "Ranchi Jharkhand"))
        pdfdata.add(pdfData("Python course", "Ranchi Jharkhand"))
        pdfdata.add(pdfData("Nodes js", "Ranchi Jharkhand"))
        recyclerView.adapter = adapter
    }}

