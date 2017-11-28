package com.oneday.daggerdemo.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.oneday.daggerdemo.di.ApplicationContext;
import com.oneday.daggerdemo.di.DatabaseInfo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by OneDay on 2017/11/28.
 *
 * ApplicationModule provide these dependencies that Context, dbName, version, and SharedPreferences.
 *
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application app) {
        this.mApplication = app;
    }

    @Provides
    Application provideApplication(){
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName(){
        return "demo-dagger.db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion(){
        return 2;
    }

    @Provides
    SharedPreferences provideSharedPrefs(){
        return mApplication.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
    }
}
