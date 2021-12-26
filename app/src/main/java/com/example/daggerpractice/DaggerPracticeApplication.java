package com.example.daggerpractice;

import android.app.Application;

import com.example.daggerpractice.dagger.component.AppComponent;
import com.example.daggerpractice.dagger.component.DaggerAppComponent;

public class DaggerPracticeApplication extends Application {
    public AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
