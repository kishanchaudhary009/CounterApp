package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //declaring buttons
        val additionbtn=findViewById<Button>(R.id.addbtn)

        val subtractionbtn:Button=findViewById(R.id.subbtn)

        val count=findViewById<TextView>(R.id.count)
          //count.setText(""+0) also ok but we can also do it in xml file
        additionbtn.setOnClickListener(){
          count.setText(""+increasecounter())

        }
        subtractionbtn.setOnClickListener(){
            count.setText(""+decreasecounter())
        }
    }
    fun increasecounter():Int{
        counter++
        return counter
    }
    fun decreasecounter():Int {
        counter--
        return counter
    }
}
