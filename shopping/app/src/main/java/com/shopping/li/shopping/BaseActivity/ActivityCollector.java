package com.shopping.li.shopping.BaseActivity;

import android.app.Activity;
import android.util.Log;

import com.shopping.li.shopping.logUtil.LogUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by li on 2018/2/23.
 */

public class ActivityCollector {
    public static List<Activity> activities =
            new ArrayList<>();

    public static  void addActivity(Activity activity){
        LogUtil.d("ActivityCollector","addActivity");
        activities.add(activity);

    }

    public static void removeActivity(Activity activity){
        LogUtil.d("ActivityCollector","removeActivity");
        activities.remove(activity);
    }
    public static void finishAll(){
        LogUtil.d("ActivityCollector","finishAll");
        for (Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
