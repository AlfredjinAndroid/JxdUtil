package com.jxd.jxd_core.base

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

/**
 *  @author : JXD
 *  @date : 2019/8/28 星期三
 */

//////////////////////////////////////////////////////
/****************************************************
 ****************************************************
 ****************************************************
 ****************************************************
 ****************************************************
 ******************以下为日期格式操作*****************
 ****************************************************
 ****************************************************
 ****************************************************
 ***************************************************/
/////////////////////////////////////////////////////

const val YMDHM = "yyyy-MM-dd HH:mm"
const val YMDHMS = "yyyy-MM-dd HH:mm:ss"
const val HM = "HH:mm"
const val Y_M_D = "yyyy-MM-dd"
const val WEEK = "EEEE"
const val YMD = "yyyyMMdd"
const val Y_M = "yyyy-MM"
const val HMS = "HH:mm:ss"
const val Y_Y = "yyyy"
const val M_M = "MM"

/**
 * date类型转为Long
 */
fun dateToLong(date: Date): Long {
    return date.time
}

/**
 * String类型转Date类型
 */
@SuppressLint("SimpleDateFormat")
fun stringToDate(time: String, timeType: String): Date? {
    var date: Date? = null
    try {
        val format = SimpleDateFormat(timeType)
        date = format.parse(time)
    } catch (e: Exception) {
    }
    return date
}

/**
 * 日期 String  转 Long
 */
fun stringToLong(time: String, timeType: String): Long {
    val date = stringToDate(time, timeType)
    return if (date == null) {
        0
    } else {
        dateToLong(date)
    }

}



//////////////////////////////////////////////////////
/*****************************************************
 *****************************************************
 *****************************************************
 *****************************************************
 **************** 以上为日期格式操作*******************
 *****************************************************
 *****************************************************
 *****************************************************
 *****************************************************
 ****************************************************/
///////////////////////////////////////////////////////
