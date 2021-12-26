package com.example.daggerpractice.entities

import android.util.Log
import com.example.daggerpractice.Engine
import com.example.daggerpractice.dagger.scopes.PerActivity
import javax.inject.Inject


@PerActivity
class Car @Inject constructor(val engine: Engine, val wheel: Wheel, val driver : Driver) {
    private val TAG = "Testing Car"
    fun runCar(){
        Log.d(TAG, "$driver runs $this")
    }
}
//Wheel is from third party library
//Engine is an interface
//Driver is singleton throughout app's lifecycle