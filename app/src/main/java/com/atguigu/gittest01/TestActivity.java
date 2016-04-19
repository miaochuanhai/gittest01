package com.atguigu.gittest01;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Log.e("TAG", "33333333");
    }
}
