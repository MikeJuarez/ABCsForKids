package com.bignerdranch.android.abcsforkids;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.CountDownTimer;
import android.view.DragEvent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

/**
 * Created by Michael Juarez on 5/22/2017.
 */

public class GameFragment extends Fragment {

    //Make reference to main image
    private ImageView gameImage;

    //Make reference to the letters on screen.
    private TextView letter1;
    private TextView letter2;
    private TextView letter3;
    private TextView letter4;

    private int letterIndex = 0;

    Boolean booleanCorrectAnswer1 = false;
    Boolean booleanCorrectAnswer2 = false;
    Boolean booleanCorrectAnswer3 = false;
    Boolean booleanCorrectAnswer4 = false;

    SoundPool soundPool;
    SoundPool.Builder soundPoolBuilder;

    AudioAttributes attributes;
    AudioAttributes.Builder attributesBuilder;

    int soundCorrect;
    int soundHarp;
    int soundHarpStream;
    int soundWrong;

    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);

        attributesBuilder = new AudioAttributes.Builder();
        attributesBuilder.setUsage(AudioAttributes.USAGE_GAME);
        attributesBuilder.setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION);
        attributes = attributesBuilder.build();

        soundPoolBuilder = new SoundPool.Builder();
        soundPoolBuilder.setAudioAttributes(attributes);
        soundPool = soundPoolBuilder.build();

        soundCorrect = soundPool.load(getActivity(), R.raw.correct, 1);
        soundHarp = soundPool.load(getActivity(), R.raw.harp, 1);
        soundWrong = soundPool.load(getActivity(), R.raw.wrong, 1);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceBundle){
        super.onCreateView(inflater, container, savedInstanceBundle);
        View view = inflater.inflate(R.layout.fragment_game_fragment, container, false);

        gameImage = (ImageView) view.findViewById(R.id.game_screen_question_image);
        letter1 = (TextView) view.findViewById(R.id.letter1);
        letter2 = (TextView) view.findViewById(R.id.letter2);
        letter3 = (TextView) view.findViewById(R.id.letter3);
        letter4 = (TextView) view.findViewById(R.id.letter4);

        letter1.setOnTouchListener(TouchListener);
        letter2.setOnTouchListener(TouchListener);
        letter3.setOnTouchListener(TouchListener);
        letter4.setOnTouchListener(TouchListener);

        displayImages();

        return view;
    }

    /*
        This method will display images in alphabetical order for now
        In the future, I plan to have the option to randomize the letters.
    */
    private void displayImages() {
        GameImageBank gameBank = new GameImageBank(getContext());
        List<Game> games = gameBank.getGameImageBank();

        String correctAnswer = games.get(letterIndex).getAnswerList().get(4);
        String answer0 = games.get(letterIndex).getAnswerList().get(0);
        String answer1 = games.get(letterIndex).getAnswerList().get(1);
        String answer2 = games.get(letterIndex).getAnswerList().get(2);
        String answer3 = games.get(letterIndex).getAnswerList().get(3);

        //Set the main image
        gameImage.setImageResource(getContext().getResources().getIdentifier(games.get(letterIndex).getGameImage(), "drawable", getContext().getPackageName()));
        gameImage.setOnDragListener(dragListener);

        //Set the letters
        letter1.setText(getContext().getResources().getIdentifier(answer0, "string", getContext().getPackageName()));
        letter2.setText(getContext().getResources().getIdentifier(answer1, "string", getContext().getPackageName()));
        letter3.setText(getContext().getResources().getIdentifier(answer2, "string", getContext().getPackageName()));
        letter4.setText(getContext().getResources().getIdentifier(answer3, "string", getContext().getPackageName()));

        if (correctAnswer.equals(answer0))
            booleanCorrectAnswer1 = true;
        else if (correctAnswer.equals(answer1))
            booleanCorrectAnswer2 = true;
        else if (correctAnswer.equals(answer2))
            booleanCorrectAnswer3 = true;
        else if (correctAnswer.equals(answer3))
            booleanCorrectAnswer4 = true;
    }

    private View.OnTouchListener TouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
            v.startDragAndDrop(null, myShadowBuilder, v, 0);
            return false;
        }
    };

    private View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    soundHarpStream = soundPool.play(soundHarp,1,1,1,-1,1);
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    View exitView = (View) event.getLocalState();
                    exitView.setVisibility(View.VISIBLE);
                    break;
                case DragEvent.ACTION_DROP:
                    final View view = (View) event.getLocalState();
                    soundPool.stop(soundHarpStream);
                    if (view.getId() == R.id.letter1) {
                        letter1.setVisibility(View.INVISIBLE);
                        if (booleanCorrectAnswer1) {
                            waitHelper();
                            break;
                        }
                        soundPool.play(soundWrong,1,1,1,0,1);
                    }
                    else if (view.getId() == R.id.letter2) {
                        letter2.setVisibility(View.INVISIBLE);
                        if (booleanCorrectAnswer2) {
                            waitHelper();
                            break;
                        }
                        soundPool.play(soundWrong,1,1,1,0,1);

                    }
                    else if (view.getId() == R.id.letter3) {
                        letter3.setVisibility(View.INVISIBLE);
                        if (booleanCorrectAnswer3) {
                            waitHelper();
                            break;
                        }
                        soundPool.play(soundWrong,1,1,1,0,1);
                    }
                    else if (view.getId() == R.id.letter4) {
                        letter4.setVisibility(View.INVISIBLE);
                        if (booleanCorrectAnswer4) {

                            waitHelper();
                            break;
                        }
                        soundPool.play(soundWrong,1,1,1,0,1);
                    }
                    break;
            }
            return true;
        }
    };

    private void resetGameFragment() {
        letter1.setVisibility(View.VISIBLE);
        letter2.setVisibility(View.VISIBLE);
        letter3.setVisibility(View.VISIBLE);
        letter4.setVisibility(View.VISIBLE);

        booleanCorrectAnswer1 = false;
        booleanCorrectAnswer2 = false;
        booleanCorrectAnswer3 = false;
        booleanCorrectAnswer4 = false;
    }

    private void waitHelper() {
        gameImage.setImageResource(R.drawable.correct);
        soundPool.play(soundCorrect,1,1,0,0,1);
        new CountDownTimer(2000,1000){

            @Override
            public void onTick(long miliseconds){}

            @Override
            public void onFinish(){
                letterIndex++;

                if (letterIndex > 25)
                    checkForEnd();
                else {
                    resetGameFragment();
                    displayImages();
                }
            }
        }.start();

    }

    private void checkForEnd() {
        Intent intent = new Intent(getContext(), CongratActivity.class);
        startActivity(intent);
    }

}
