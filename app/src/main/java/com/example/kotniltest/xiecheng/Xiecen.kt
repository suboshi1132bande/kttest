package com.example.kotniltest.xiecheng

import kotlinx.coroutines.*

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 1/2/21 9:31 PM
 *  description : 协程
 */


/**
 *
 * GlobalScope.launch       可以在任意地方调用
 * runBlocking      可以在任意地方调用
 * coroutineScope       协程作用域或者挂起函数中调用
 * launch           只能在协程作用域调用
 *
 *
 *
 */

fun testBlocking(){
    // GlobalScope.launch {

    //runBlocking 阻塞 可以保证协程中的代码执行完  一般测试用
    runBlocking {
        println("codes run in coroutine scope")
        delay(1500)// 非阻晒 只能在协程 的作用域中 或者其他挂起函数中调用
        println("code run in corountine finished")
    }

    //  }
    Thread.sleep(1000)
}

fun testTime(){
    val start = System.currentTimeMillis()
    runBlocking {
        repeat(100000){
            launch {
                println(".")
            }
        }
    }
    val end = System.currentTimeMillis()
    println(end - start)
}

//suspend 关键字将一个函数声明成挂起函数 但是还没有协程的作用域
suspend fun printlnDot(){
    println(".")
    delay(1000)
}

//coroutineScope 可以有协程作用域 并且可以保证 在其内部 代码和子协程执行完之前阻塞
suspend fun printDot() = coroutineScope {
    launch {
        println(".")
        delay(1000)
    }
}

//runBlocking 会阻塞当前线程 coroutineScope 不会
fun testCorout(){
    runBlocking {
        coroutineScope {
            launch {
                for (i in 1..10){
                    println("i = $i")
                    delay(1000)
                }
            }
        }
        println("corout finshed")
    }
    println("runbloking finshed")
}
fun main(){
    //testBlocking()
   // test()
   // testTime()
    testCorout()
}

fun test(){
   runBlocking {

       //launch 必须在协程的作用域中调用
       launch {
           println("launch1")
           delay(1000)
           println("launch1 finshed")
       }
       launch {
           println("launch2")
           delay(1000)
           println("launch2 finished")
       }
   }
}