package com.company;

import java.util.Scanner;


public class Game implements Runnable{

    enum State {

    }

    private Gamestate gameState = Gamestate.GAMESTART;
    private Gamestate nextState;
    private String nextInput = "";

    private Player player;

    public void run() {
        while(true) {
            switch (gameState) {
                case GAMESTART:
                    init();
                    nextState = Gamestate.GAMEINPUT;
                    break;
                case GAMEINPUT:
                    Renderer.Display("me rendererererere");
                    var s = Renderer.Input();
                    Renderer.Display(s);
                    s = Renderer.Input("ooff: ");
                    Renderer.Display(s);
                    nextState = Gamestate.GAMEND;
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
        player = new Player();
    }

}
