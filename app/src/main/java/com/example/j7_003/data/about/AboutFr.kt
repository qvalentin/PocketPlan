package com.example.j7_003.data.about

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.j7_003.MainActivity
import com.example.j7_003.R

/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class AboutFr : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }
}