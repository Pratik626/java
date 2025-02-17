package com.wipro.java.usecase3;
import java.util.Scanner;

public class TicTacToe {
    private static final char EMPTY = ' ';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private static char[][] board = {
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = PLAYER_X;
        boolean gameRunning = true;

        System.out.println("Welcome to Tic-Tac-Toe!");
        printBoard();

        while (gameRunning) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column: 1-3 1-3): ");
            int row, col;
            
            // Input validation loop
            while (true) {
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
                
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY) {
                    break;
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            }

            // Make the move
            board[row][col] = currentPlayer;
            printBoard();

            // Check if the current player has won
            if (checkWinner(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameRunning = false;
                break;
            }

            // Check if the board is full (draw)
            if (isBoardFull()) {
                System.out.println("It's a draw!");
                gameRunning = false;
                break;
            }

            // Switch Player
            currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
        }
        scanner.close();
    }

    // Prints the current state of the board
    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Checks if the given player has won
    private static boolean checkWinner(char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||  // Row check
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {  // Column check
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||  // Main diagonal
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {  // Anti-diagonal
            return true;
        }

        return false;
    }

    // Checks if the board is full (game draw)
    private static boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
