package com.example.daggerpractice.dagger.modules

import com.example.daggerpractice.Engine
import com.example.daggerpractice.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindEngine(engine: PetrolEngine) : Engine
}
// it is recommended to use @Binds whenever we provide interface