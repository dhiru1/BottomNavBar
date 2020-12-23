package com.example.bottomnavbar.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.bottomnavbar.R


class NotificationFragment : Fragment(),View.OnClickListener {
     var textView: TextView?=null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myView: View = inflater.inflate(R.layout.fragment_notification, container, false)
        textView = myView.findViewById<TextView>(R.id.notification) as TextView
        textView!!.setOnClickListener(this)
        return myView
    }

    override fun onClick(p0: View?) {
        Toast.makeText(context, "hello", Toast.LENGTH_LONG).show()
    }
}