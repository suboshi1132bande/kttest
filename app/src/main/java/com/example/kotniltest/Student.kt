package com.example.kotniltest

import android.util.Log
import com.example.kotniltest.intface.Study

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/15/20 10:40 PM
 *  description :
 */
class Student(val sno: String,val grald: Int,name: String,age: Int) : Person(name,age),Study{
    //var sno = ""
    //var grade = 0
    //init {
       // println("son is" + sno)
        //println("grade is " + grade)
   // }

    //次构造函数 必须调用主构造函数
    constructor(name: String,age: Int) : this("",0,name,age)
    constructor() : this("",0)

    override fun readBooks() {
       // Log.v("student","book")
        println(name +" is reaing book")
    }

    //注释掉也不会抱异常
//    override fun doHomeworks() {
//       // Log.v("student","homwork")
//        println(name + "is do home work")
//    }
}