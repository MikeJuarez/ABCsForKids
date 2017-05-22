package com.bignerdranch.android.abcsforkids;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class MainScreenActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return new MainScreenFragment();
    }
}
