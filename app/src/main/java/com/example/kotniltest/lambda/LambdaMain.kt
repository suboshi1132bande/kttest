package com.example.kotniltest.lambda

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/16/20 11:28 PM
 *  description :
 */

fun main(){
    testLambda()
}

fun testLambda(){
    val list = listOf("aa","bbb","cccc","ddddd")
    //找最长的字符串
    //lambda 表达式 语法结构 {参数1：类型 参数2:类型 -> 函数体}
    val lambda  = {value: String -> value.length} //定义一个 表达式 ,lambda 接收遍历参数 并给出判断条件 是lenght

    val maxlenght = list.maxBy(lambda)// maxBy会接收一个 lambda函数作为参数 并遍历集合 将遍历结果作为参数传给lambda
  //  println(maxlenght)

    //简化语句 1
    val maxlenght2 = list.maxBy({vuale: String -> vuale.length})

    //简化语句2
    //lambda 参数 是函数的最后一个 参数可以将 lambda表达式移到括号外面
    val maxlenght3 = list.maxBy(){vaule: String -> vaule.length}

    //简化3
    //如果lambda 是函数唯一的参数 可以将括号省虐
    val maxlenght4 = list.maxBy{vlaue -> vlaue.length}

    //简化4
    //当lambda 参数只有一个的时候可以不必声明 用it 来代替
    val maxlenght5 = list.maxBy{it.length}

    println(maxlenght5)
}