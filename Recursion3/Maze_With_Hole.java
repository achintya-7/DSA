package Recursion3;

import java.util.ArrayList;

public class Maze_With_Hole {
    public static void main(String[] args) {
        boolean [][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
        };

        System.out.println(allPathAvoidingHole("", maze, 0, 0));
    }

    static ArrayList<String> allPathAvoidingHole(String p, boolean [][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (maze[r][c] == false) {
            return list;
        }

        if (r < maze.length - 1) {
            list.addAll(allPathAvoidingHole(p + 'D', maze, r + 1, c));
        }

        if (c < maze[0].length - 1) {
            list.addAll(allPathAvoidingHole(p + 'R', maze, r, c + 1));
        }

        return list;
    }
}
