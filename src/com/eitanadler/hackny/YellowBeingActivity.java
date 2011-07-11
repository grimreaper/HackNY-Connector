package com.eitanadler.hackny;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

import com.pras.sp.ParseFeed;

public class YellowBeingActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        if("sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT))
        	ParseFeed.doCustomizationForSDK();
    }
}