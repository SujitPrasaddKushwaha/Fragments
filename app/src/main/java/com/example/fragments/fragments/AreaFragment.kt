package com.example.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.fragments.R
class AreaFragment : Fragment() {
    private lateinit var radius : EditText
    private lateinit var areacalculate : Button
    val pi : Int = 22/7

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_area,container,false)
        radius = view.findViewById(R.id.etRadius)
        areacalculate = view.findViewById(R.id.btnAreaCalculate)

        areacalculate.setOnClickListener(){
            areaofCircle()
        }
        return view

    }

    private fun areaofCircle() {
        val radius = radius.text.toString().toInt()
        val result = pi * radius * radius
        Toast.makeText(context, "The area of circle is $result", Toast.LENGTH_SHORT).show()
    }
}