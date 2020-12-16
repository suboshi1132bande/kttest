package com.example.kotniltest

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/15/20 10:33 PM
 *  description :
 */
open class Person (val name: String,val age: Int){

    fun eat(){
        println(name + "is eating. He is " + age + " years old.")
    }
}