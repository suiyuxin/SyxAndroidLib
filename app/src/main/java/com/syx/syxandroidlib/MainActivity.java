package com.syx.syxandroidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.syx.syxownlib.ConvertUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConvertUtils.bytes2HexString(new byte[]{0x15,0x18});
    }
}
