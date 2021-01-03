package com.example.kotniltest.biaozhunhanshu

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/28/20 10:03 PM
 *  description : 使用 infix 函数构建可读的语法
 */


infix fun String.with(str: String) = startsWith(str) //因为是 String 的扩展函数 因此 函数内部拥有String 的上下文

//泛型 函数
infix fun<T> Collection<T>.has(element: T) = contains(element)

//模仿 a to b
infix fun<A,B> A.to(b: B) : Pair<A,B> = Pair(this,b)

fun main(){
    val str = "hjkl"
    str.with("h")//传统写法
    str with "h"  //infix 写法

    val list = listOf("a","b","c")
    val b = list has "a"
    println(b)

    val map = mapOf("aa" to 2,"bb" to 3)
}