package com.bignerdranch.android.abcsforkids;

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
    private int correctAnswer = 0;

    Boolean booleanCorrectAnswer1 = false;
    Boolean booleanCorrectAnswer2 = false;
    Boolean booleanCorrectAnswer3 = false;
    Boolean booleanCorrectAnswer4 = false;

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

        displayImages(letterIndex);

        return view;
    }

    /*
        This method will display images in alphabetical order for now
        In the future, I plan to have the option to randomize the letters.
    */
    private void displayImages(int letterIndex) {
        GameImageBank gameBank = GameImageBank.get(getActivity());
        List<Game> games = gameBank.getGameImageBank();

        String correctAnswer = games.get(letterIndex).getAnswerList().get(41);
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
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    final View view = (View) event.getLocalState();
                    if (view.getId() == R.id.letter1 && booleanCorrectAnswer1) {
                        gameImage.setImageResource(R.drawable.correct);
                        booleanCorrectAnswer1 = false;
                    }
                    else if (view.getId() == R.id.letter2 && booleanCorrectAnswer2) {
                        gameImage.setImageResource(R.drawable.correct);
                        booleanCorrectAnswer2 = false;
                    }
                    else if (view.getId() == R.id.letter3 && booleanCorrectAnswer3) {
                        gameImage.setImageResource(R.drawable.correct);
                        booleanCorrectAnswer3 = false;
                    }
                    else if (view.getId() == R.id.letter4 && booleanCorrectAnswer4) {
                        gameImage.setImageResource(R.drawable.correct);
                        booleanCorrectAnswer4 = false;
                    }
                    break;
            }
            return true;
        }
    };

}
