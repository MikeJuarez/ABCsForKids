package com.bignerdranch.android.abcsforkids;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Michael Juarez on 5/22/2017.
 */

public class GameActivity extends SingleFragmentActivity {

    MediaPlayer ourSong;

    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        ourSong = MediaPlayer.create(this, R.raw.game_music);
        ourSong.setLooping(true);
        ourSong.setVolume(0.2f,0.2f);
        ourSong.start();
    }

    public Intent getIntent(Context context) {
        Intent intent = new Intent(context, GameActivity.class);
        return intent;
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


    @Override
    protected Fragment createFragment() {
        return new GameFragment();
    }
}
