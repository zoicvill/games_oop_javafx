package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (VerticalWin(board, i) | HorizontalWin(board, i)) {
                rsl = true;
                break;
            }


        }
        return rsl;
    }

    public static boolean VerticalWin(int[][] board, int vertical) {
        boolean rsl = true;
        for (int[] ints : board) {
            if (ints[vertical] == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean HorizontalWin(int[][] board, int horizontal) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[horizontal][i] == 0) {
                rsl = false;
                break;

            }
        }
        return rsl;
    }
}
