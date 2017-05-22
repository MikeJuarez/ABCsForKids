package com.bignerdranch.android.abcsforkids;

import android.support.v4.app.Fragment;

/**
 * Created by Michael Juarez on 5/22/2017.
 */

public class GameActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new GameFragment();
    }
}
