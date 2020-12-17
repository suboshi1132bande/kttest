package com.example.kotniltest.string

import com.example.kotniltest.data.Callphone

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/17/20 11:03 PM
 *  description :
 */

fun main(){
    test()
    printPam(123)
    printPam2(str = "hhaha")
}

fun test(){
    //字符串内嵌表达式
    val brand = "samsuning"
    val price = 2388.88
    println("Callphone(brand = $brand,price = $price)")
}

//给函数设定默认值
fun printPam(num: Int,str: String = "holle"){
    println("num is $num , str is $str")
}

fun printPam2(num: Int = 123,str: String){
    println("num is $num , str is $str")
}