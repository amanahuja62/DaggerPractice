package com.example.daggerpractice.dagger.component;

import com.example.daggerpractice.MainActivity;
import com.example.daggerpractice.dagger.modules.DieselEngineModule;
import com.example.daggerpractice.dagger.modules.WheelsModule;
import com.example.daggerpractice.dagger.scopes.PerActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;


@PerActivity
@Component(dependencies = AppComponent.class, modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {

    void inject(MainActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        Builder appComponent(AppComponent appComponent);
        ActivityComponent build();

    }
}
