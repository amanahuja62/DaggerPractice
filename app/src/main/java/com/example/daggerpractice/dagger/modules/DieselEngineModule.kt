package com.example.daggerpractice.dagger.modules

import com.example.daggerpractice.Engine
import com.example.daggerpractice.entities.DieselEngine
import dagger.Binds
import dagger.Module


@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun bindDieselEngine(dieselEngine: DieselEngine) : Engine
}