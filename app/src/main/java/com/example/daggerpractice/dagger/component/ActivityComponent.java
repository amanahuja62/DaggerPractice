package com.example.daggerpractice.dagger.component;

import com.example.daggerpractice.MainActivity;
import com.example.daggerpractice.dagger.modules.DieselEngineModule;
import com.example.daggerpractice.dagger.modules.PetrolEngineModule;
import com.example.daggerpractice.dagger.modules.WheelsModule;
import com.example.daggerpractice.dagger.scopes.PerActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Subcomponent;


@PerActivity
@Subcomponent( modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {
    void inject(MainActivity activity);

    @Subcomponent.Builder
    interface Builder{
        @BindsInstance Builder horsePower(@Named("horse power") int horsePower);
        ActivityComponent build();
    }
}
// fun appComponent(appComponent : AppComponent) : Builder   ---> used only if component has dependencies
//not used if subComponent, because subComponent cannot have dependecies