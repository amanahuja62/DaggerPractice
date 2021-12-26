package com.example.daggerpractice

import android.util.Log
import javax.inject.Inject

class PetrolEngine (val horsePower : Int) : Engine {
    private val TAG = "testing engine"
    override fun runEngine() {
        Log.d(TAG, "runEngine: engine is running...$horsePower")
    }
}