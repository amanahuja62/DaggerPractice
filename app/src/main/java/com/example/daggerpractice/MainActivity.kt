package com.example.daggerpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpractice.dagger.component.DaggerActivityComponent
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
        DaggerActivityComponent.builder().appComponent(myApplication.getAppComponent()).horsePower(1400).build().inject(this)
        car1.runCar()
        car2.runCar()

    }
}