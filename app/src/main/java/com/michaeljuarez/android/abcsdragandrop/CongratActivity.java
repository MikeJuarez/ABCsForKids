package com.michaeljuarez.android.abcsdragandrop;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by user on 5/24/2017.
 */

public class CongratActivity extends SingleFragmentActivity{

    MediaPlayer ourSong;

    @Override
    public void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        ourSong = MediaPlayer.create(this, R.raw.congrat_music);
        ourSong.setVolume(0.2f,0.2f);
        ourSong.setLooping(true);
        ourSong.start();
    }

    @Override
    protected Fragment createFragment() {
        return new CongratFragment();
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
}
