package com.example.daggerpractice.dagger.component

import com.example.daggerpractice.dagger.modules.DieselEngineModule
import com.example.daggerpractice.dagger.modules.PetrolEngineModule
import com.example.daggerpractice.dagger.modules.WheelsModule
import com.example.daggerpractice.dagger.scopes.AppScope
import com.example.daggerpractice.entities.Driver
import dagger.Component

@AppScope
@Component
interface AppComponent {
    fun getActivityComponentBuilder() : ActivityComponent.Builder
}

// we need to pass all modules of subcomponent as argument which are non-abstract and have constructor arguments
//both WheelsModule and PetrolEngineModule are non abstarct, but
// only PetrolEngine has constructor arguments so we will pass only petrolEngineModule

//@AppScope directs DriverModule to AppComponent