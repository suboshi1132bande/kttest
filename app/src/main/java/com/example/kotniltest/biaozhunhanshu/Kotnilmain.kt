package com.example.kotniltest.biaozhunhanshu

import java.lang.StringBuilder

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/19/20 5:16 PM
 *  description :
 */

fun main(){
    //withTest()
    //runTest()
    aplyTest()
}

fun withTest(){
    //kotnil 标准函数 with
    val list = listOf("a","b","c")
    val resoult = with(StringBuilder()){
        append("start")
        for (fu in list){
            append(fu+"\n")
        }
        append("end")
        toString()
    }
    println(resoult)
}

fun runTest(){
    //kotnil 标准函数 run
    val list2 = listOf("a","b","c")
    val resoult = StringBuffer().run {
        append("start\n")
        for ( fu in list2){
            append("$fu\n")
        }
        append("end")
        toString()
    }
    println(resoult)
}

fun aplyTest(){
    //kotnil 标准函数 apply
    val list3 = listOf("a","c","b")
    val resoult = StringBuilder().apply {
        append("start\n")
        for (fu in list3){
            append("$fu\n")
        }
        append("end")
    }
    println(resoult.toString())
}