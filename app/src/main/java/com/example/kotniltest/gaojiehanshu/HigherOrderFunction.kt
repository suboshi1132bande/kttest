package com.example.kotniltest.gaojiehanshu

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/23/20 10:20 PM
 *  description :  高阶函数
 */

//这是一个高阶函数
fun num1Andnum2(num1: Int,num2: Int, operation: (Int,Int) -> Int) : Int{
    val resoult = operation(num1,num2)
    return resoult
}

//高阶函数传入的参数 1
fun puls(num1: Int,num2: Int) : Int{
    return num1 + num2
}

//高阶函数 传入的参数 2
fun minus(num1: Int,num2: Int) : Int{
    return num1 - num2
}

//内联函数
inline fun num1Andnum2l(num1: Int,num2: Int,operation: (Int, Int) -> Int) : Int{
    return operation(num1,num2)
}

fun main(){
    val nn = num1Andnum2(5,6, ::puls)
    val nm = num1Andnum2(6,7,::minus)
    println("puls is $nn")
    println("mins is $nm")

    //高阶函数 lambda 表达式 写法
    val j = num1Andnum2(100,20){n1,n2 -> n1 + n2}
    val m = num1Andnum2(200,30){n1,n2 -> n1 - n2}

    println(j)
    println(m)

    val ll = num1Andnum2l(20,10){n,m -> n + m}

    println("this is inline = $ll")
}
