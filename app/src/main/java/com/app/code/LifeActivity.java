package com.app.code;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * ================================================
 * 作者：陈潮安
 * 日期：2019/7/30 0030
 * 描述：生命
 * ================================================
 */
public class LifeActivity extends AppCompatActivity {

    private static final String TAG = "LifeActivity";

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        print("onSaveInstanceState()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        print("onRestoreInstanceState()");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
        print("onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        print("onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        print("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        print("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        print("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        print("onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        print("onDestroy()");
    }

    private void print(String str) {
        if (BuildConfig.DEBUG)
            Log.d(TAG, str);
    }
}
