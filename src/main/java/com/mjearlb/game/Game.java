package com.mjearlb.game;

/**
 * This contains methods used for the game 2048.
 */
public class Game {

    private int score;
    private int[][] board;

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
        this.board = new int[4][4];
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = 0;
            } // for
        } // for
        this.board[(int) (Math.random() * 4)][(int) (Math.random() * 4)] = 2;
        this.board[(int) (Math.random() * 4)][(int) (Math.random() * 4)] = 2;
        printBoard();
    } // startGame

    /**
     * Prints the current board.
     */
    public void printBoard() {
        clearScreen();
        String cell;
        System.out.println("+-------------------+");
        System.out.println("|       2048!       |");
        System.out.println("+-------------------+");
        for (int i = 0; i < this.board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < this.board[i].length; j++) {
                if (this.board[i][j] != 0) {
                    cell = String.format("%4d", this.board[i][j]);
                } else {
                    cell = "    ";
                } // if/else
                System.out.print(cell + "|");
            } // for
            System.out.println();
            System.out.println("+-------------------+");
        } // for
    } // printBoard

    /**
     * Clears the terminal window.
     */
    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    } // clearScreen

    public void slideHandler(String input) {
        switch (input) {
        case "L" :
            slideCells(0, 4, 0, 4, 1, 1);
            break;
        case "R":
            slideCells(0, 4, 3, -1, 1, -1);
            break;
        } // switch
    } // slideHandler

    /**
     * Slides the cells.
     */
    private void slideCells(int colStart, int colFin, int rowStart,
        int rowFin, int colInc, int rowInc) {
        int numFound = rowStart;
        for (int i = colStart; i != colFin; i += colInc) {
            for (int j = rowStart; j != rowFin; j += rowInc) {
                if (this.board[i][j] != 0) {
                    this.board[i][numFound] = this.board[i][j];
                    if (j != numFound) {
                        this.board[i][j] = 0;
                    } // if
                    numFound += rowInc;
                } // if
            } // for
            numFound = rowStart;
        } // for
        addRandom();
        printBoard();
    } // slideCells

    /**
     * Adds a random block to the board in an unoccupied spot.
     */
    private void addRandom() {
        System.out.println("addRandom(): I do nothing!");
    } // addRandom

} // Game
