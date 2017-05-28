package com.bignerdranch.android.abcsforkids;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import static android.R.transition.fade;
import static com.bignerdranch.android.abcsforkids.R.id.fragment_container;

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
        FragmentTransaction transaction = fm.beginTransaction();

        Fragment fragment = fm.findFragmentById(fragment_container);

        if (fragment == null)
            fragment = createFragment();

        transaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out,R.anim.fade_in, R.anim.fade_out).add(fragment_container, fragment).commit();
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }


    @Override
    public void onBackPressed() {
        if (this.getClass().equals(MainScreenActivity.class))
            super.onBackPressed();
    }


}
