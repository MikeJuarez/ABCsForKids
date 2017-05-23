package com.bignerdranch.android.abcsforkids;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 5/22/2017.
 */

public class Game {

    private String gameImage;
    private String answer;
    private List<String> answerList;
    private List<String> gameLetterList;

    public Game(String letter) {

        answerList = new ArrayList();
        gameLetterList = new ArrayList();

        fillGameLetterList();

        switch (letter) {
            case "a":
                gameImage = randomA();
                answer = gameLetterList.get(0);
                answerList = getAnswerList(0);
                break;
            case "b":
                gameImage = randomB();
                answer = gameLetterList.get(1);
                answerList = getAnswerList(1);
                break;
            case "c":
                gameImage = randomB();
                answer = gameLetterList.get(2);
                answerList = getAnswerList(2);
                break;
            case "d":
                gameImage = randomB();
                answer = gameLetterList.get(3);
                answerList = getAnswerList(3);
                break;
            case "e":
                gameImage = randomB();
                answer = gameLetterList.get(4);
                answerList = getAnswerList(4);
                break;
            case "f":
                gameImage = randomB();
                answer = gameLetterList.get(5);
                answerList = getAnswerList(5);
                break;
            case "g":
                gameImage = randomB();
                answer = gameLetterList.get(6);
                answerList = getAnswerList(6);
                break;
            case "h":
                gameImage = randomB();
                answer = gameLetterList.get(7);
                answerList = getAnswerList(7);
                break;
            case "i":
                gameImage = randomB();
                answer = gameLetterList.get(8);
                answerList = getAnswerList(8);
                break;
            case "j":
                gameImage = randomB();
                answer = gameLetterList.get(9);
                answerList = getAnswerList(9);
                break;
            case "k":
                gameImage = randomB();
                answer = gameLetterList.get(10);
                answerList = getAnswerList(10);
                break;
            case "l":
                gameImage = randomB();
                answer = gameLetterList.get(11);
                answerList = getAnswerList(11);
                break;
            case "m":
                gameImage = randomB();
                answer = gameLetterList.get(12);
                answerList = getAnswerList(12);
                break;
            case "n":
                gameImage = randomB();
                answer = gameLetterList.get(13);
                answerList = getAnswerList(13);
                break;
            case "o":
                gameImage = randomB();
                answer = gameLetterList.get(14);
                answerList = getAnswerList(14);
                break;
            case "p":
                gameImage = randomB();
                answer = gameLetterList.get(15);
                answerList = getAnswerList(15);
                break;
            case "q":
                gameImage = randomB();
                answer = gameLetterList.get(16);
                answerList = getAnswerList(16);
                break;
            case "r":
                gameImage = randomB();
                answer = gameLetterList.get(17);
                answerList = getAnswerList(17);
                break;
            case "s":
                gameImage = randomB();
                answer = gameLetterList.get(18);
                answerList = getAnswerList(18);
                break;
            case "t":
                gameImage = randomB();
                answer = gameLetterList.get(19);
                answerList = getAnswerList(19);
                break;
            case "u":
                gameImage = randomB();
                answer = gameLetterList.get(20);
                answerList = getAnswerList(20);
                break;
            case "v":
                gameImage = randomB();
                answer = gameLetterList.get(21);
                answerList = getAnswerList(21);
                break;
            case "w":
                gameImage = randomB();
                answer = gameLetterList.get(22);
                answerList = getAnswerList(22);
                break;
            case "x":
                gameImage = randomB();
                answer = gameLetterList.get(23);
                answerList = getAnswerList(23);
                break;
            case "y":
                gameImage = randomB();
                answer = gameLetterList.get(24);
                answerList = getAnswerList(24);
                break;
            case "z":
                gameImage = randomB();
                answer = gameLetterList.get(25);
                answerList = getAnswerList(25);
                break;
            default:
                gameImage = null;
                answer = null;
                break;
        }
    }

    private void fillGameLetterList(){
        gameLetterList.add("game_letter_a");
        gameLetterList.add("game_letter_b");
        gameLetterList.add("game_letter_c");
        gameLetterList.add("game_letter_d");
        gameLetterList.add("game_letter_e");
        gameLetterList.add("game_letter_f");
        gameLetterList.add("game_letter_g");
        gameLetterList.add("game_letter_h");
        gameLetterList.add("game_letter_i");
        gameLetterList.add("game_letter_j");
        gameLetterList.add("game_letter_k");
        gameLetterList.add("game_letter_l");
        gameLetterList.add("game_letter_m");
        gameLetterList.add("game_letter_n");
        gameLetterList.add("game_letter_o");
        gameLetterList.add("game_letter_p");
        gameLetterList.add("game_letter_q");
        gameLetterList.add("game_letter_r");
        gameLetterList.add("game_letter_s");
        gameLetterList.add("game_letter_t");
        gameLetterList.add("game_letter_u");
        gameLetterList.add("game_letter_v");
        gameLetterList.add("game_letter_w");
        gameLetterList.add("game_letter_x");
        gameLetterList.add("game_letter_y");
        gameLetterList.add("game_letter_z");
    }

    private String randomA(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "game_screen_question_image_ball1";
            case 2:
                return "game_screen_question_image_ball2";
            case 3:
                return "game_screen_question_image_bee";
            default:
                return null;
        }
    }

    private String randomB(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "game_screen_question_image_ball1";
            case 2:
                return "game_screen_question_image_ball2";
            case 3:
                return "game_screen_question_image_bee";
            default:
                return null;
        }
    }

    private List<String> getAnswerList(int answer) {
        List<String> letterList = new ArrayList();
        int count = 0;
        int badAnswer1 = -1;
        int badAnswer2 = -1;
        int badAnswer3 = -1;
        int goodAnswer = answer;

        while (count != 3){
            Random rand = new Random();
            int n = rand.nextInt(25) + 1;

            if ((n != goodAnswer) && (n != badAnswer1) && (n != badAnswer2) && (n != badAnswer3))
            {
                letterList.add(gameLetterList.get(n));
                switch (count) {
                    case 0:
                        badAnswer1 = n;
                        break;
                    case 1:
                        badAnswer2 = n;
                        break;
                    case 2:
                        badAnswer3 = n;
                        letterList.add(gameLetterList.get(answer));
                        break;
                }
                count++;
            }
        }

        Collections.shuffle(letterList);
        letterList.add(gameLetterList.get(answer));

        return letterList;
    }

    public String getGameImage(){
        return gameImage;
    }

    public String getAnswer() {
        return answer;
    }

    public List<String> getAnswerList() {
        return answerList;
    }
}
