package com.oneday.daggerdemo.di.component;

import com.oneday.daggerdemo.MainActivity;
import com.oneday.daggerdemo.di.PerActivity;
import com.oneday.daggerdemo.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by OneDay on 2017/11/28.
 *
 * ActivityComponent is a Component which links the {@link MainActivity} dependencies and the {@link ActivityModule}
 *
 * Note: This is a interface that is implemented by Dagger2.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
