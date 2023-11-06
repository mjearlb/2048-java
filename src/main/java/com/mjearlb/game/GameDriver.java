package com.mjearlb.game;

import com.mjearlb.game.Game;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class GameDriver {

    private static Scanner keyboard = new Scanner(System.in);
    private static boolean playing = true; 

    public static void main(String[] args) {
        Game game = new Game();

        while (playing) {
            game.slideHandler(keyboard.nextLine());
        } // while
    } // main
} // GameDriver
