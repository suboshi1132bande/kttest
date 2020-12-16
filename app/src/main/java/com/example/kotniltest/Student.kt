package com.example.kotniltest

import android.util.Log
import com.example.kotniltest.intface.Study

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/15/20 10:40 PM
 *  description :
 */
class Student(name: String,age: Int) : Person(name,age),Study{
    //var sno = ""
    //var grade = 0
    //init {
       // println("son is" + sno)
        //println("grade is " + grade)
   // }

    override fun readBooks() {
       // Log.v("student","book")
        println(name +" is reaing book")
    }

//    override fun doHomeworks() {
//       // Log.v("student","homwork")
//        println(name + "is do home work")
//    }
}