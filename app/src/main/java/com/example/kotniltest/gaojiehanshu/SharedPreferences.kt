package com.example.kotniltest.gaojiehanshu

import android.content.SharedPreferences

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/24/20 10:13 PM
 *  description :
 */

fun SharedPreferences.open(blok: SharedPreferences.Editor.() -> Unit){
    val editor = edit()
    editor.blok()
    editor.apply()
}

fun main(){

}