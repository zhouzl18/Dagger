package com.oneday.daggerdemo.di.component;

import android.app.Application;
import android.content.Context;

import com.oneday.daggerdemo.DemoApplication;
import com.oneday.daggerdemo.data.DataManager;
import com.oneday.daggerdemo.data.DbHelper;
import com.oneday.daggerdemo.data.SharedPrefsHelper;
import com.oneday.daggerdemo.di.ApplicationContext;
import com.oneday.daggerdemo.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by OneDay on 2017/11/28.
 *
 * ApplicationComponent is a Component which links the {@link DemoApplication} dependency and the {@link ApplicationModule}
 *
 * Note: The ApplicationComponent is a interface that is implemented by Dagger2.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication app);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    DbHelper getDbHelper();

    SharedPrefsHelper getSharedPrefsHelper();
}
