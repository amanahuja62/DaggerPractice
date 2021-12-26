package com.example.daggerpractice.entities

import android.util.Log

class Wheel constructor(private val tyre: Tyre, private val rim: Rim) {
    private val TAG = "testing wheel"
    fun runWheel(){
        Log.d(TAG, "runWheel: wheel is running...")
    }
}