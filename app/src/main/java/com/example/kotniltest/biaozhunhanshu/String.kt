package com.example.kotniltest.biaozhunhanshu

import java.lang.StringBuilder

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/22/20 9:43 PM
 *  description : 扩展函数
 */

/**
 * 计算字符串中 字符的个数
 */
fun String.lettersCount() : Int{
    var count = 0;
    for (char in this){
        if (char.isLetter()){
            count ++
        }
    }
    return count
}

/**
 * 重载 * 达到 用字符串 * n (让字符串重复n遍)
 */
//operator fun String.times(n: Int) : String{
//    val str = StringBuilder()
//    repeat(n){
//        str.append(this)
//    }
//    return str.toString()
//}

/**
 * 简化版
 */
operator fun String.times(n: Int) = repeat(n)