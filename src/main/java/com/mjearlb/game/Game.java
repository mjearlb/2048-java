package com.mjearlb.game;

/**
 * This contains methods used for the game 2048.
 */
public class Game {

    private int score;
    private char[][] board;

    /**
     * Creates a new {@code Game}.
     */
    public Game() {
        this.score = 0;
        startGame();
    } // Game

    /**
     * Starts the game.
     */
    private void startGame() {
        this.board = new char[4][4];
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = " ";
            } // for
        } // for
        printBoard();
    } // startGame

    /**
     * Prints the current board.
     */
    public void printBoard() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                System.out.print(this.board[i][j]);
            } // for
        } // for
    } // printBoard

} // Game
