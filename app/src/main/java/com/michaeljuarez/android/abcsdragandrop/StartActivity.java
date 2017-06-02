package com.michaeljuarez.android.abcsdragandrop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.MobileAds;

/**
 * Created by user on 5/31/2017.
 */

public class StartActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        Intent intent = new Intent(this, MainScreenActivity.class);
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        startActivity(intent);









    }
}
