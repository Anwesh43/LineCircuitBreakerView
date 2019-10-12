package com.anwesh.uiprojects.linecircuitbreakerview

/**
 * Created by anweshmishra on 12/10/19.
 */

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Canvas

val nodes : Int = 5
val scGap : Float = 0.01f
val strokeFactor : Int = 90
val delay : Long = 20
val foreColor : Int = Color.parseColor("#9C27B0")
val backColor : Int = Color.parseColor("#BDBDBD")

fun Int.inverse() : Float = 1f / this
fun Float.maxScale(i : Int, n : Int) : Float = Math.max(0f, this - i * n.inverse())
fun Float.divideScale(i : Int, n : Int) : Float = Math.min(n.inverse(), maxScale(i, n)) * n
