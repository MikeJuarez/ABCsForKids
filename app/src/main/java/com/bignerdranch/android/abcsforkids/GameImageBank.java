package com.bignerdranch.android.abcsforkids;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 5/22/2017.
 */

public class GameImageBank {

    private static GameImageBank mGameImageBank;
    private List<Game> mGames;

    public GameImageBank(Context context) {
        mGames = new ArrayList<>();

        mGames.add(new Game("a"));
        mGames.add(new Game("b"));
        mGames.add(new Game("c"));
        mGames.add(new Game("d"));
        mGames.add(new Game("e"));
        mGames.add(new Game("f"));
        mGames.add(new Game("g"));
        mGames.add(new Game("h"));
        mGames.add(new Game("i"));
        mGames.add(new Game("j"));
        mGames.add(new Game("k"));
        mGames.add(new Game("l"));
        mGames.add(new Game("m"));
        mGames.add(new Game("n"));
        mGames.add(new Game("o"));
        mGames.add(new Game("p"));
        mGames.add(new Game("q"));
        mGames.add(new Game("r"));
        mGames.add(new Game("s"));
        mGames.add(new Game("t"));
        mGames.add(new Game("u"));
        mGames.add(new Game("v"));
        mGames.add(new Game("w"));
        mGames.add(new Game("x"));
        mGames.add(new Game("y"));
        mGames.add(new Game("z"));
    }

    public List<Game> getGameImageBank() {
        return mGames;
    }
}
