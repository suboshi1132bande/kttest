package com.example.kotniltest.single

import com.example.kotniltest.Student

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/16/20 10:29 PM
 *  description : 单例
 */
object Singleton {
    var student: Student? = null
    fun singletonTest(){
        println("Singletontest is called.")
    }

    fun setstudent(stu: Student){
        student = stu
    }
    fun test(){
        student?.doHomeworks()
    }
}