package com.example.daggerpractice.entities

import com.example.daggerpractice.dagger.scopes.AppScope
import javax.inject.Inject

@AppScope
class Driver @Inject constructor(){
}