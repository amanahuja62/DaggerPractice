package com.example.daggerpractice.dagger.modules

import com.example.daggerpractice.Engine
import com.example.daggerpractice.PetrolEngine
import com.example.daggerpractice.dagger.scopes.PerActivity
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule(val horsePower: Int) {
    @PerActivity
    @Provides
    fun providesHorsePower(): Int {
        return horsePower
    }
    @PerActivity
    @Provides
    fun providesEngine(horsePower: Int): Engine {
        return PetrolEngine(horsePower)
    }
}