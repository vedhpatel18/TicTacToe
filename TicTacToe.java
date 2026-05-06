/* 
@version 2.0
@author Vedh
 */
import java.util.Random;

public class TicTacToe {

    static char[][] board = new char[3][3];

    static char currentPlayer;
    static char player1Symbol;
    static char player2Symbol;

    public static void main(String[] args) {
        initializeBoard();
        toss();
        printBoard();
    }

    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    static void toss() {
        Random rand = new Random();
        int result = rand.nextInt(2); // 0 or 1

        if (result == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1Symbol;
            System.out.println("Player 1 starts and is 'X'");
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2Symbol;
            System.out.println("Player 2 starts and is 'X'");
        }
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}