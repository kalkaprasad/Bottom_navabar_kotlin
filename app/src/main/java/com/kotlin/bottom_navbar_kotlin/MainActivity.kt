package com.kotlin.bottom_navbar_kotlin

import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var homefreagment: homefreagment
    lateinit var collegeFragement: collegeFragement
    lateinit var notesfragement: notesfragement
    lateinit var liveclassFragment: liveclassFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar=supportActionBar
        actionBar!!.title="SBS College"
        actionBar.elevation= 10F

        val bottomNavigation: BottomNavigationView=findViewById(R.id.navigation_view)


// this is the Default Home Framgent when the the App will open
        homefreagment= homefreagment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.framelayout,homefreagment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

        bottomNavigation.setOnNavigationItemSelectedListener { item ->

            when(item.itemId)
            {
                // here create the Fragment...
                R.id.home->{
                    homefreagment= homefreagment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelayout,homefreagment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.college->{
                    collegeFragement= collegeFragement()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelayout,collegeFragement)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit() }

                R.id.notes->{

                    notesfragement= notesfragement()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelayout,notesfragement)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit() }
                R.id.liveclass->{
                    liveclassFragment= liveclassFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelayout,liveclassFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }}
            true
        }

    }

//    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
//        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
//            //Do something
//
//            Toast.makeText(this, "Down botton press", Toast.LENGTH_LONG).show()
//        }
//        return true
//    }
//
//    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
//        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
//            //Do something
//
//            Toast.makeText(this, "up botton press", Toast.LENGTH_LONG).show()
//        }
//        return true
//    }

//    override fun onStart() {
//        super.onStart()
//        Toast.makeText(this,"Start Activity",Toast.LENGTH_LONG).show()
//        print("Activiy start")
//
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Toast.makeText(this,"Activity destroy",Toast.LENGTH_LONG).show()
//
//
//    }
//
//    override fun onBackPressed() {
//        super.onBackPressed()
//        Toast.makeText(this,"App closed",Toast.LENGTH_LONG).show()
//        print("back press botton")
//    }

}
