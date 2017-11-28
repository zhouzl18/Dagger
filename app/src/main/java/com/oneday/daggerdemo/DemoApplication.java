package com.oneday.daggerdemo;

import android.app.Application;
import android.content.Context;

import com.oneday.daggerdemo.di.component.ApplicationComponent;
import com.oneday.daggerdemo.di.component.DaggerApplicationComponent;
import com.oneday.daggerdemo.di.module.ApplicationModule;

/**
 * Created by OneDay on 2017/11/28.
 *
 * DemoApplication
 */

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    public static DemoApplication get(Context context){
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
