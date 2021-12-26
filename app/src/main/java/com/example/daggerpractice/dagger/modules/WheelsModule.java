package com.example.daggerpractice.dagger.modules;

import com.example.daggerpractice.entities.Rim;
import com.example.daggerpractice.entities.Tyre;
import com.example.daggerpractice.entities.Wheel;
import com.example.daggerpractice.dagger.scopes.PerActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    @PerActivity
    @Provides
    Rim provideRim() {
        return new Rim();
    }

    @PerActivity
    @Provides
    Tyre provideTyre() {
        return new Tyre();
    }

    @PerActivity
    @Provides
    Wheel provideWheel(Rim rim, Tyre tyre) {
        return new Wheel(tyre, rim);
    }
}
/*
  Whenever we cannot add @Inject to constructor of a class (because its from third party or its an interface),
  then we make module to provide its instance.
  Provides method are always in non abstract class.
  Binds method are always in abstarct class. Binds method are primarily used for providing instance of interfaces

  Some important points ------
  i) never use scope annotation with @Binds. Use scope annotation with Impl and Impl should have @Inject constructor()
  ii) if constructor of a class X needs runtime parameters, i.e.,
       Class X @Inject constructor(val initialValue : Int), then, there are two ways of achieving it :
       a) Use bindsInstance
            Class X @Inject constructor(val initialValue : Int)

            @Component
            interface ActivityComponent{
              fun inject(mainActivity : MainActivity)
              @Component.Builder
                interface Builder{
                   @BindsInstance
                    fun initialValue(initialValue : Int) : Builder
                    fun build() : ActivityComponent

                }
            }

       b) Use module with constructor

         Class X (initialValue : Int)

         @Module
         Class XModule(val initialValue : Int){
            @Provides
            fun provideX() = X(initialValue)
         }

 */