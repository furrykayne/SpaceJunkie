package com.company;

import java.util.Scanner;


public class Game implements Runnable{

    enum State {
        GAMESTART,
        GAMEOUTPUT,
        GAMEINPUT,
        GAMEND,
    }

    private State gameState = State.GAMESTART;
    private State nextState;
    private String nextInput = "";
    private Scanner scanner;

    private Player player;

    public void run() {
        while(true) {
            switch (gameState) {
                case GAMESTART:
                    init();
                    nextState = State.GAMEINPUT;
                    break;
                case GAMEINPUT:
                    System.out.println("THIS IS WHERE STORY HAPPENS IF I HAD ANY");
                    nextState = State.GAMEND;
                    break;
                case GAMEOUTPUT:
                    break;
                case GAMEND:
                    return;
                default:
                    try {
                        throw new Exception("fuck u");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }

            gameState = nextState;
        }
    }

    private void init() {
        scanner = new Scanner(System.in);
        player = new Player();


    }

}
