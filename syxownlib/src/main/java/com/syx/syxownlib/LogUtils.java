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

    public void LogD(boolean flag,String TAG,String message){
        if (flag==true)
        {
            Log.d(TAG,message);
        }
    }
    public void LogE(boolean flag,String TAG,String message){
        if (flag==true)
        {
            Log.e(TAG,message);
        }
    }
    public void LogW(boolean flag,String TAG,String message){
        if (flag==true)
        {
            Log.w(TAG,message);
        }
    }
    public void LogI(boolean flag,String TAG,String message){
        if (flag==true)
        {
            Log.i(TAG,message);
        }
    }
    public void LogV(boolean flag,String TAG,String message){
        if (flag==true)
        {
            Log.v(TAG,message);
        }
    }
}
