package Recursion3;

public class N_Queens {
    public static void main(String[] args) {
        int n = 10;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for all rows and columns
        for (int col = 0; col < board.length; col++) {
            // place the queen if its safe
            if (isSafe(board, row, col) == true) {
                board[row][col] = true; // * locking the value
                count = count + queens(board, row + 1);
                board[row][col] = false; // * unlocking the value
            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // * check vertical rows
        for (int i = 0; i < row; i++) {
            if (board[i][col] == true) {
                return false;
            }
        }

        // * check diagonal left
        int leftTurns = Math.min(row, col);
        for (int i = 1; i <= leftTurns; i++) {
            if (board[row - i][col - i] == true) {
                return false;
            }
        }

        // * check diagonal right
        int rightTurns = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= rightTurns; i++) {
            if (board[row - i][col + i] == true) {
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean elemet : row) {
                if (elemet) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}