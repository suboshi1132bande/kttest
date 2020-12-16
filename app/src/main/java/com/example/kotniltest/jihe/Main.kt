package com.example.kotniltest.jihe

import java.util.HashMap

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/16/20 10:51 PM
 *  description :
 */
fun main(){
    //listfoin()
    //setfoin()
    maptest()
}

//list
fun listfoin(){
    val list = listOf("a","b","c","d","e")//不可变(只能读取 不能 添加 删除 修改)
    val list2 = mutableListOf("a","b","c","d","e")//可变
    for (i in list){
        println(i)
    }
    list2.add("f")
    for (n in list2){
        println(n)
    }
}

//set
fun setfoin(){
    val set = setOf("a","b","c","d","e","f")
    for (f in set){
        println(f)
    }
}

//map
fun maptest(){
    val map = HashMap<String,Int>()
    map["a"] = 1
    map["b"] = 2
    map["c"] = 3
    map["d"] = 4
    val number = map["c"]
    println("number = "+number)

    val map2 = mapOf("a" to 1,"b" to 2,"c" to 3)
    for ((key,value) in map2){
        println(key+"="+value)
    }
}