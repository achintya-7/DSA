package Recursion3;

public class N_Knights {
    public static void main(String[] args) {
        int n = 10;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }

    static void knight(boolean [][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length - 1) {
            // skip it if they are at edge
            return;
        }

        if (col == board.length) {
            knight(board, row + 1, 0, knights);
        }

        if (isSafe(board, row, col) == true) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        knight(board, row, col + 1, knights);
    }

    static boolean isSafe(boolean [][] board, int row, int col) {

        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1] == true) {
                return false;
            }
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1] == true) {
                return false;
            }
        }
        if (isValid(board, row - 1 , col - 2)) {
            if (board[row - 1][col - 2] == true) {
                return false;
            }
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2] == true) {
                return false;
            }
        }

        return true;
    }


    static boolean isValid(boolean [][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }

        return false;
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
