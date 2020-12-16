package com.example.kotniltest

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener {

    val Tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test_bt.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.test_bt ->{
                Log.v(Tag,"VVVVVV")
                Log.d(Tag,"DDDDD")
                Log.i(Tag,"IIIII")
                Log.w(Tag,"WWwW")
                Log.e(Tag,"EEEEE")
            }
        }
    }
}