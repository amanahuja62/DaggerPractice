package com.example.daggerpractice.entities

import android.util.Log
import com.example.daggerpractice.Engine
import com.example.daggerpractice.dagger.scopes.PerActivity
import javax.inject.Inject
import javax.inject.Named

@PerActivity
class DieselEngine  @Inject constructor(@Named("horse power")val horsePower : Int): Engine {
    private val TAG = "diesel engine test"

    override fun runEngine() {
        Log.d(TAG, "runEngine: running diesel engine ---- horsePower = ${horsePower}")
    }
}