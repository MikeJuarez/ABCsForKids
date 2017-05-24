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
                gameImage = randomC();
                answer = gameLetterList.get(2);
                answerList = getAnswerList(2);
                break;
            case "d":
                gameImage = randomD();
                answer = gameLetterList.get(3);
                answerList = getAnswerList(3);
                break;
            case "e":
                gameImage = randomE();
                answer = gameLetterList.get(4);
                answerList = getAnswerList(4);
                break;
            case "f":
                gameImage = randomF();
                answer = gameLetterList.get(5);
                answerList = getAnswerList(5);
                break;
            case "g":
                gameImage = randomG();
                answer = gameLetterList.get(6);
                answerList = getAnswerList(6);
                break;
            case "h":
                gameImage = randomH();
                answer = gameLetterList.get(7);
                answerList = getAnswerList(7);
                break;
            case "i":
                gameImage = randomI();
                answer = gameLetterList.get(8);
                answerList = getAnswerList(8);
                break;
            case "j":
                gameImage = randomJ();
                answer = gameLetterList.get(9);
                answerList = getAnswerList(9);
                break;
            case "k":
                gameImage = randomK();
                answer = gameLetterList.get(10);
                answerList = getAnswerList(10);
                break;
            case "l":
                gameImage = randomL();
                answer = gameLetterList.get(11);
                answerList = getAnswerList(11);
                break;
            case "m":
                gameImage = randomM();
                answer = gameLetterList.get(12);
                answerList = getAnswerList(12);
                break;
            case "n":
                gameImage = randomN();
                answer = gameLetterList.get(13);
                answerList = getAnswerList(13);
                break;
            case "o":
                gameImage = randomO();
                answer = gameLetterList.get(14);
                answerList = getAnswerList(14);
                break;
            case "p":
                gameImage = randomP();
                answer = gameLetterList.get(15);
                answerList = getAnswerList(15);
                break;
            case "q":
                gameImage = randomQ();
                answer = gameLetterList.get(16);
                answerList = getAnswerList(16);
                break;
            case "r":
                gameImage = randomR();
                answer = gameLetterList.get(17);
                answerList = getAnswerList(17);
                break;
            case "s":
                gameImage = randomS();
                answer = gameLetterList.get(18);
                answerList = getAnswerList(18);
                break;
            case "t":
                gameImage = randomT();
                answer = gameLetterList.get(19);
                answerList = getAnswerList(19);
                break;
            case "u":
                gameImage = randomU();
                answer = gameLetterList.get(20);
                answerList = getAnswerList(20);
                break;
            case "v":
                gameImage = randomV();
                answer = gameLetterList.get(21);
                answerList = getAnswerList(21);
                break;
            case "w":
                gameImage = randomW();
                answer = gameLetterList.get(22);
                answerList = getAnswerList(22);
                break;
            case "x":
                gameImage = randomX();
                answer = gameLetterList.get(23);
                answerList = getAnswerList(23);
                break;
            case "y":
                gameImage = randomY();
                answer = gameLetterList.get(24);
                answerList = getAnswerList(24);
                break;
            case "z":
                gameImage = randomZ();
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
                return "acorn";
            case 2:
                return "alligator";
            case 3:
                return "apple";
            default:
                return null;
        }
    }

    private String randomB(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "banana";
            case 2:
                return "game_screen_question_image_ball1";
            case 3:
                return "game_screen_question_image_bee";+-*-
            default:
                return null;
        }
    }

    private String randomC(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "carrot";
            case 2:
                return "cat";
            case 3:
                return "corn";
            default:
                return null;
        }
    }

    private String randomD(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "dinosaur";
            case 2:
                return "dog";
            case 3:
                return "doughnut";
            default:
                return null;
        }
    }
    private String randomE(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "egg";
            case 2:
                return "elephant";
            case 3:
                return "eye";
            default:
                return null;
        }
    }
    private String randomF(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "feather";
            case 2:
                return "firetruck";
            case 3:
                return "fish";
            default:
                return null;
        }
    }
    private String randomG(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "giraffe";
            case 2:
                return "glue";
            case 3:
                return "grape";
            default:
                return null;
        }
    }
    private String randomH(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "hand";
            case 2:
                return "hat";
            case 3:
                return "hotdog";
            default:
                return null;
        }
    }
    private String randomI(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "icecream";
            case 2:
                return "icecube";
            case 3:
                return "igloo";
            default:
                return null;
        }
    }
    private String randomJ(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "jaguar";
            case 2:
                return "jar";
            case 3:
                return "jelly";
            default:
                return null;
        }
    }
    private String randomK(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "kangaroo";
            case 2:
                return "king";
            case 3:
                return "kite";
            default:
                return null;
        }
    }
    private String randomL(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "leaves";
            case 2:
                return "lemon";
            case 3:
                return "lion";
            default:
                return null;
        }
    }
    private String randomM(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "mermaid";
            case 2:
                return "monkey";
            case 3:
                return "mountain";
            default:
                return null;
        }
    }
    private String randomN(){
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;

        switch (n) {
            case 1:
                return "needle";
            case 2:
                return "nest";
            default:
                return null;
        }
    }
    private String randomO(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "octopus";
            case 2:
                return "orange";
            case 3:
                return "ostrich";
            default:
                return null;
        }
    }
    private String randomP(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "pancake";
            case 2:
                return "pencil";
            case 3:
                return "pig";
            default:
                return null;
        }
    }
    private String randomQ(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "quarter";
            case 2:
                return "queen";
            case 3:
                return "question";
            default:
                return null;
        }
    }
    private String randomR(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "robot";
            case 2:
                return "rooster";
            case 3:
                return "rose";
            default:
                return null;
        }
    }
    private String randomS(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "scissors";
            case 2:
                return "snake";
            case 3:
                return "snowman";
            default:
                return null;
        }
    }
    private String randomT(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "train";
            case 2:
                return "truck";
            case 3:
                return "turtle";
            default:
                return null;
        }
    }
    private String randomU(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "umbrella";
            case 2:
                return "unicorn";
            case 3:
                return "unicycle";
            default:
                return null;
        }
    }
    private String randomV(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "vacuum";
            case 2:
                return "vase";
            case 3:
                return "violin";
            default:
                return null;
        }
    }
    private String randomW(){
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1:
                return "whale";
            case 2:
                return "window";
            case 3:
                return "worm";
            default:
                return null;
        }
    }
    private String randomX(){
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;

        switch (n) {
            case 1:
                return "xray";
            case 2:
                return "xylophone";
            default:
                return null;
        }
    }
    private String randomY(){
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;

        switch (n) {
            case 1:
                return "yarn";
            case 2:
                return "yoyo";
            default:
                return null;
        }
    }
    private String randomZ(){
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;

        switch (n) {
            case 1:
                return "zebra";
            case 2:
                return "zipper";
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
