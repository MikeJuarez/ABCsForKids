package com.michaeljuarez.android.abcsdragandrop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Michael Juarez on 5/20/2017.
 */

public class MainScreenFragment extends Fragment {

    Button btn_new_game;

    @Override
    public void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_main_screen, container, false);

        btn_new_game = (Button) view.findViewById(R.id.main_activity_new_game_button);
        btn_new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*FragmentManager fm = getFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(fragment_container, new MainScreenSelectGameFragment()).commit();*/
                Intent intent = new GameActivity().getIntent(getActivity());
                startActivity(intent);
            }
        });

        return view;
    }
}
