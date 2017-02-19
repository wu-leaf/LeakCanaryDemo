package com.veyron.www.leakcanarydemo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Veyron on 2017/2/19.
 * Function：全局配置LeakCanary，作用于所有activity
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        setupLeakCanary();
    }
    /**
     * 配置LeakCanary
     */
    private void setupLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
