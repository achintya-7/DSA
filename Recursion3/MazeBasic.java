package Recursion3;

import java.util.ArrayList;

public class MazeBasic{
    public static void main(String[] args) {
        ArrayList<String> list = allPaths("", 3, 3);
        
        System.out.println(list);
    }

    static ArrayList<String> allPaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(allPaths(p + 'D', r - 1, c));
        }

        if (c > 1) {
            list.addAll(allPaths(p + 'R', r, c - 1));
        }
        
        return list;
    }
}
