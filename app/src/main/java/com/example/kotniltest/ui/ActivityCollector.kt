package com.example.kotniltest.ui

import android.app.Activity

/**
 *  author : Bobo
 *  e-mail : 827578285@qq.com
 *  date   : 12/22/20 10:58 PM
 *  description :
 */

//单例
object ActivityCollector {

    private val activitys = ArrayList<Activity>()

    //beasActivity 中调用
    fun addActivity(activity: Activity){
        activitys.add(activity)
    }

    //beasActvty 中调用
    fun removeActivity(activity: Activity){
        activitys.remove(activity)
    }

    fun finshAll(){
        for (ac in activitys){
            if (!ac.isFinishing){
                ac.finish()
            }
        }
        activitys.clear()
    }

}