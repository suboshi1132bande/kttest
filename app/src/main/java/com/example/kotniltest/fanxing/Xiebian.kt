package com.example.kotniltest.fanxing

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/29/20 8:42 PM
 *  description : 泛型 协变
 */

open class Person(val name: String,val age: Int)
class Student(name: String,age: Int) : Person(name,age)
class Teacher(name: String,age: Int) : Person(name,age)


class SimpleData<T>{

    private var data: T? = null

    fun set(t: T?){
        data = t
    }

    fun get() : T?{
        return data
    }
}

fun handleSimpdata(data: SimpleData<Person>){
    val teacher = Teacher("io",48)
    data.set(teacher)
}

//协变
class Xsimpledata<out T>(val data: T?){
    //T只能出现在out 位置

    fun get() : T?{
        return data
    }
}

fun xhandlerSimpldata(data: Xsimpledata<Person>){

}

fun main(){
    val student = Student("zz",14)
    var data = SimpleData<Student>()
    data.set(student)
    //handleSimpdata(data)  编译不通过 simpdata<student> 不是 simpldata<person> 的子类

    val xstudent = Student("ioo",23)
    val xdata = Xsimpledata<Student>(xstudent)
    val d = xdata.get()
    xhandlerSimpldata(xdata) //编译通过 协变  xsimpdata<student> 是 xsimpldata<person> 的子类
}