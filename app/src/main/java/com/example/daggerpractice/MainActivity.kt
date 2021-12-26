package com.example.daggerpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpractice.dagger.modules.PetrolEngineModule
import com.example.daggerpractice.entities.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myApplication = application as DaggerPracticeApplication
        myApplication.getAppComponent().getActivityComponentBuilder().horsePower(1700).build()
            .inject(this)
        car1.runCar()
        car1.engine.runEngine()
        car2.runCar()
        car2.engine.runEngine()

    }
}