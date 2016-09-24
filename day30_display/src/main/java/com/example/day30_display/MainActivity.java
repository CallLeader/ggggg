package com.example.day30_display;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getScreenInfo();
    }

    private void getScreenInfo() {
        DisplayMetrics dm = getResources().getDisplayMetrics();
        //屏幕的密度比
        float density = dm.density;
        //屏幕密度
        int dpi = dm.densityDpi;
        //屏幕宽度,px单位
        int w = dm.widthPixels;
        int h = dm.heightPixels;
        //字体在屏幕显示的比
        float sd = dm.scaledDensity;

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("密度比:  ").append(density).append("\n")
                .append("密度:  ").append(dpi).append("\n")
                .append("宽度:  ").append(w).append("\n")
                .append("高度:  ").append(h).append("\n")
                .append("字体在屏幕显示的比:  ").append(sd).append("\n");
        Log.d("xxx", stringBuilder.toString());


    }
}
