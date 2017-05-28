package com.bignerdranch.android.abcsforkids;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by user on 5/24/2017.
 */

public class CongratFragment extends Fragment {
    Button home_button;
    Button new_game_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceBundle){
        super.onCreateView(inflater, container, savedInstanceBundle);

        View view = inflater.inflate(R.layout.fragment_congrat, container, false);



        home_button = (Button) view.findViewById(R.id.congrat_home_button);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = MainScreenActivity.newIntent(getContext());
                startActivity(intent);
            }
        });

        new_game_button = (Button) view.findViewById(R.id.congrat_new_game);

        new_game_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new GameActivity().getIntent(getContext());
                startActivity(intent);
            }
        });
        return view;
    }
}
