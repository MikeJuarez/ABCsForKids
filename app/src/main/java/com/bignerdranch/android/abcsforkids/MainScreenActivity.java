package com.bignerdranch.android.abcsforkids;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v4.app.Fragment;
import android.os.Bundle;

public class MainScreenActivity extends SingleFragmentActivity {

    private MediaPlayer ourSong;


    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);

        ourSong = MediaPlayer.create(this, R.raw.intro_music);
        ourSong.setLooping(true);
        ourSong.setVolume(0.2f,0.2f);
        ourSong.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        ourSong.pause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        ourSong.start();
    }

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, MainScreenActivity.class);
        return intent;
    }

    @Override
    public Fragment createFragment() {
        return new MainScreenFragment();
    }


}
