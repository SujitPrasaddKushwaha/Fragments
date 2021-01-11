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

class SumFragment : Fragment() {

    private lateinit var first: EditText
    private lateinit var second: EditText
    private lateinit var sumcalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_sum, container, false)
        first = view.findViewById(R.id.etFirst)
        second = view.findViewById(R.id.etSecond)
        sumcalculate = view.findViewById(R.id.btnSumCalculate)

        sumcalculate.setOnClickListener() {
            addtwonumber()
        }

        return view
    }


private fun addtwonumber() {
    val first = first.text.toString().toInt()
    val second = second.text.toString().toInt()
    val result = first + second
    Toast.makeText(context, "Sum of two number is $result", Toast.LENGTH_SHORT).show()
}
}