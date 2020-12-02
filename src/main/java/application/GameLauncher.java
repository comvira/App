package main.java.application;

import main.java.resources.GuessGame;

public class GameLauncher {
    public static void main (String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
