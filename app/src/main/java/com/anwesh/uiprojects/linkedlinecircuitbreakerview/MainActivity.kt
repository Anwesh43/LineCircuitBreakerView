package com.anwesh.uiprojects.linkedlinecircuitbreakerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.linecircuitbreakerview.LineCircuitBreakerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LineCircuitBreakerView.create(this)
    }
}
