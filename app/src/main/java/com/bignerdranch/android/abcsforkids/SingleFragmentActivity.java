package com.bignerdranch.android.abcsforkids;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;

/**
 * Created by Michael Juarez on 5/20/2017.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity{

    //Classes must implement these method(s):
    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null)
            fragment = createFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();

    }
}
