package com.example.kotniltest.weituo

import kotlin.reflect.KProperty

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/27/20 2:13 PM
 *  description : 委托 个人认为 类似于java 中的代理
 */

//委托类
class MySet<T>(val helperSet: HashSet<T>) : Set<T> by helperSet{
    fun helloword() = println("holle word")

//    override fun isEmpty(): Boolean {
//        return false
//    }

    override fun isEmpty() = false
}

//委托属性

class Myclass{
var p by Delegate()
}

class Delegate{

    var propvalue: Any? = null

    operator fun getValue(myclass: Myclass,prop: KProperty<*>) : Any?{
        return propvalue
    }

    operator fun setValue(myclass: Myclass,prop: KProperty<*>,value: Any?){
        propvalue = value
    }
}