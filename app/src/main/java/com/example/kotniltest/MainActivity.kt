package com.example.kotniltest

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.kotniltest.gaojiehanshu.open
import com.example.kotniltest.ui.FistActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener {

    val Tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test_bt.setOnClickListener(this)
        bt_2.setOnClickListener(this)
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
            R.id.bt_2 ->{
                val intent = Intent(this,FistActivity::class.java)
                startActivity(intent)
            }
        }
    }

    fun testSharedpreference(){
        getSharedPreferences("name",Context.MODE_PRIVATE).open {
            putInt("kk",8)
            putBoolean("t",true)
        }

    }
}