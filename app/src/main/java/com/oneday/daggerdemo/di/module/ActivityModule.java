package com.oneday.daggerdemo.di.module;

import android.app.Activity;
import android.content.Context;

import com.oneday.daggerdemo.di.ActivityContext;
import com.oneday.daggerdemo.di.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by OneDay on 2017/11/28.
 *
 * ActivityModule provide Context dependencies.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }

    @Provides
    Activity provideActivity(){
        return mActivity;
    }
}
