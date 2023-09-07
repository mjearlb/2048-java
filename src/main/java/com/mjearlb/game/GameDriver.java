package com.mjearlb.game;

import com.mjearlb.game.Game;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class GameDriver {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Game game = new Game();

        while (true) {
            game.slideHandler(keyboard.nextLine());
        } // while
    } // main
} // GameDriver
