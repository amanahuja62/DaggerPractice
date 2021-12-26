package com.example.daggerpractice.dagger.component;

import com.example.daggerpractice.MainActivity;
import com.example.daggerpractice.dagger.modules.PetrolEngineModule;
import com.example.daggerpractice.dagger.modules.WheelsModule;
import com.example.daggerpractice.dagger.scopes.PerActivity;

import dagger.Subcomponent;


@PerActivity
@Subcomponent( modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    void inject(MainActivity activity);
}