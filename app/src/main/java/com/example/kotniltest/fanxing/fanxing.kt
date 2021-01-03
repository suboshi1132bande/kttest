package com.example.kotniltest.fanxing

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/27/20 1:54 PM
 *  description :
 */

//泛型类
class MyClass<T>{
    fun method(parm: T) : T{
        return parm
    }
}

//泛型方法
class Myclass2{
    fun <T>methon(parm: T) : T{
        return parm
    }
}


//对泛型的类型进行限制
class Myclass3{

    //对方法的泛型限制为Number
    fun <T: Number> methon(parm: T) : T{
        return parm
    }

    //泛型 默认都可以为空类型Any?  不为空的写法
    fun <T: Any> methon(parm: T) : T{
        return parm
    }
}
