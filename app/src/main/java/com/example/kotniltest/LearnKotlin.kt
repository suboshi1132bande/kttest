package com.example.kotniltest

import com.example.kotniltest.data.Callphone
import com.example.kotniltest.intface.Study
import com.example.kotniltest.single.Singleton
import kotlin.math.max

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/15/20 9:19 PM
 *  description :
 */
fun main(){
    val jk = maxNumber(3,6)
    val bf = maxNumber2(4,8)
    println(jk)
    println(bf)
    println(maxNumber3(18,4))
    checkNumber(23L)
    xunHuan(0,10)
    val student = Student("jom",18)
    doDuty(student)

    val callphone1 = Callphone("huawei",2222.21)
    val callphone2 = Callphone("huawei",2222.22)
    println(callphone1)
    println(callphone1.equals(callphone2))
    println(callphone1 == callphone2)

    //单例
    println(Singleton.singletonTest())

}

fun maxNumber(numb1: Int,numb2: Int): Int{
   // return max(numb1,numb2)
    return if (numb1 > numb2){
        numb1
    }else{
        numb2
    }
}

//使用最后一行代码作为返回值
fun maxNumber2(numb1: Int,number2: Int) = if (numb1 > number2){
    numb1
}else{
    number2
}

//函数体只有一行代码可以直接写在末尾
fun maxNumber3(numb1: Int,numb2: Int) = if (numb1 > numb2) numb1 else numb2

//when
fun checkNumber(num: Number){
    when(num){
        is Int -> println("number is Int")
        is Double -> println("number is Doubler")
        else -> println("number not support")
    }
}

//when 中不传参数
fun getStor(name: String) = when{
    name == "tom" -> 78
    name == "jim" -> 90
    name == "lili" -> 89
    else -> 0
}

//for - in 循环语句
//可以用  val range = 0..10 表示一个区间
fun xunHuan(fist: Int,last: Int){
//    for (i in fist..last){
//        println(i)
//    }
// val rang = 0 until 10 左闭右开  意思是 < 10

//    for (i in fist until last){
//        println(i)
//    }

    //默认 加一
    // step 2 表示加2
    for (i in fist until last step 2){
        println(i)
    }

    //降序
    for (i in last downTo fist){
        println(i)
    }

}

fun doDuty(student: Study){
    student.readBooks()
    student.doHomeworks()
}

