package com.example.daggerpractice.dagger.component

import com.example.daggerpractice.dagger.scopes.AppScope
import com.example.daggerpractice.entities.Driver
import dagger.Component

@AppScope
@Component
interface AppComponent {
    fun getDriver() : Driver
}