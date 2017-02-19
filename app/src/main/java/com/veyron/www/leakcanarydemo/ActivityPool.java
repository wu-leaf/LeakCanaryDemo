package com.veyron.www.leakcanarydemo;

import android.app.Activity;

import java.util.ArrayList;

/**
 * Created by Veyron on 2017/2/19.
 * Function：静态变量测试类
 */

public class ActivityPool {
     //静态变量的生命周期和应用程序一致
    public static ActivityPool activityPool = new ActivityPool();
    public static ArrayList<Activity> activities = new ArrayList<>();

    public static ActivityPool getActivity() {
        return activityPool;
    }

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }
}
