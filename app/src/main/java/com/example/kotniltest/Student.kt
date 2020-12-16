package com.example.kotniltest

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/15/20 10:40 PM
 *  description :
 */
class Student(val sno: String, val grade: Int) : Person(){
    //var sno = ""
    //var grade = 0
    init {
        println("son is" + sno)
        println("grade is " + grade)
    }
}