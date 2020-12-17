package com.example.kotniltest.`null`

import com.example.kotniltest.Student

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/17/20 10:37 PM
 *  description :
 */
fun main(){
    println(textLenght(null))
    println(textLenght("jikul"))
}


//计算一段文本的长度
// ?. 如果为空 啥也不做 ?: 如果左边不为空 输出 返回左边 否则返回 右边
fun textLenght(text: String?) = text?.length ?: 0

fun doStudy(stu: Student?){
    stu?.doHomeworks()
    stu?.readBooks()
}


//简化版 使用let函数(接收一个lambda 然后将调用者作为参数传给lambda)
fun doletStudy(stu: Student?){
//    stu?.let { stu ->
//        stu.readBooks()
//        stu.readBooks()
//    }
 stu?.let {
     it.readBooks()
    it.doHomeworks()
 }

}
