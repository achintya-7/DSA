package Recursion3;

import java.util.ArrayList;

public class Maze_With_Diagonal {
    public static void main(String[] args) {
        System.out.println(allPathDiagonal("", 3, 3));
    }

    static ArrayList<String> allPathDiagonal(String p, int r, int c) {

        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
    
        if (r > 1) {
            list.addAll(allPathDiagonal(p + 'V', r - 1, c));
        }

        if (c > 1) {
            list.addAll(allPathDiagonal(p + 'H', r, c - 1));
        }

        if (r > 1 && c > 1) {
            list.addAll(allPathDiagonal(p + 'D', r - 1, c - 1));
        }

        return list;
    }
}
