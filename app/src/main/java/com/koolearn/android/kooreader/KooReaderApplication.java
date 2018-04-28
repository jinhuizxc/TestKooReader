package com.koolearn.android.kooreader;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.koolearn.klibrary.ui.android.library.ZLAndroidApplication;


public class KooReaderApplication extends ZLAndroidApplication {

    private static KooReaderApplication baseApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
    }

    public static Context getAppContext() {
        return baseApplication;
    }
    public static Resources getAppResources() {
        return baseApplication.getResources();
    }
    @Override
    public void onTerminate() {
        super.onTerminate();
    }


}