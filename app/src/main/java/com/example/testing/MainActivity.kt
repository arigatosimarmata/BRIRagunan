package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dtObject = "images/image" to 600 to 611
        val mmdata = listOf(0, "xlarge", null, null, "image", "urllink", dtObject)
        val multimedia = mutableListOf(mmdata)

//        val strTemp = multimedia.map { (mmdata, _) ->  mmdata }.onEach { println(it) }
//            .filter {  }
        val dumydata = "England" to "London"
        println(multimedia)
        println(dumydata.second)
    }
}

