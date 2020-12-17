package com.example.kotniltest

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/17/20 11:33 PM
 *  description :  用默认构参数 代替构造函数
 */
class Student2(val sno: String = "",val gradl: Int = 0, name: String,age: Int) : Person(name,age){
}