package com.mjearlb.game;

/**
 * This contains methods used for the game 2048.
 */
public class Game {

    private int score;
    private String[][] board;

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
        this.board = new String[4][4];
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = "   ";
            } // for
        } // for
        this.board[(int) (Math.random() * 4)][(int) (Math.random() * 4)] = " 2 ";
        this.board[(int) (Math.random() * 4)][(int) (Math.random() * 4)] = " 2 ";
        printBoard();
    } // startGame

    /**
     * Prints the current board.
     */
    public void printBoard() {
        clearScreen();
        System.out.println("+---------------+");
        System.out.println("|     2048!     |");
        System.out.println("+---------------+");
        for (int i = 0; i < this.board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < this.board[i].length; j++) {
                System.out.print(this.board[i][j] + "|");
            } // for
            System.out.println();
            System.out.println("+---------------+");
        } // for
    } // printBoard

    /**
     * Clears the terminal window.
     */
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    } // clearScreen

} // Game
