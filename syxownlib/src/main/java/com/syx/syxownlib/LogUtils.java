package com.syx.syxownlib;

import android.util.Log;

/**
 * Created by FREESKY on 2016/12/28.
 * 控制log输出的工具类
 */

public class LogUtils {
    private LogUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void LogD(boolean flag,String TAG,String message){
        if (flag==true)
        {
            Log.d(TAG,message);
        }
    }
    public static void LogE(boolean flag,String TAG,String message){
        if (flag==true)
        {
            Log.e(TAG,message);
        }
    }
    public static void LogW(boolean flag,String TAG,String message){
        if (flag==true)
        {
            Log.w(TAG,message);
        }
    }
    public static void LogI(boolean flag,String TAG,String message){
        if (flag==true)
        {
            Log.i(TAG,message);
        }
    }
    public static void LogV(boolean flag,String TAG,String message){
        if (flag==true)
        {
            Log.v(TAG,message);
        }
    }
}
