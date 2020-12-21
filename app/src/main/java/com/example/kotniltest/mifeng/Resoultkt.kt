package com.example.kotniltest.mifeng

import java.lang.Exception
import java.lang.IllegalArgumentException

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/21/20 9:57 PM
 *  description :
 */

interface Resout
class Success(val msg: String) : Resout
class Failure(val error: Exception) : Resout

//这种写法要加无意义的else
fun getResoultMsg(resoult: Resout){
    when(resoult){
        is Success -> resoult.msg
        is Failure -> resoult.error.message
        else -> throw IllegalArgumentException()
    }
}

//密封类
sealed class Resoule
class Success1(val msg: String) : Resoule()
class Failure2(val error: Exception) : Resoule()

fun getResoult2(resoult: Resoule){
    when(resoult){
        is Success1 -> resoult.msg
        is Failure2 -> resoult.error.message
    }
}