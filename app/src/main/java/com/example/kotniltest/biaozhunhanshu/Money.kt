package com.example.kotniltest.biaozhunhanshu

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/22/20 10:01 PM
 *  description :  运算符重载
 */


class Money (val vaule: Int){

    /**
     * 对象 加 对象
     */
    operator fun plus(money: Money) : Money{
        val  number = vaule + money.vaule
        return Money(number)
    }

    /**
     * 对象 加 数字
     */
    operator fun plus(v: Int) : Money{
        val sum = vaule + v
        return Money(sum)
    }
}

