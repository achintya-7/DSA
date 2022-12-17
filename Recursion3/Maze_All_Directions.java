package Recursion3;

import java.util.ArrayList;

public class Maze_All_Directions {
    public static void main(String[] args) {
      boolean [][] maze = {
        {true, true, true},
        {true, true, true},
        {true, true, true},
      };  

      System.out.println(allDirections("", maze, 0, 0));
    }

    static ArrayList<String> allDirections(String p, boolean [][] maze, int r, int c) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        // * if its already false, skip it
        if (maze[r][c] == false) {
            return list;
        }

        // * locking the cell here
        maze[r][c] = false;

        if (r < maze.length - 1) {
            list.addAll(allDirections(p + 'D', maze, r + 1, c));
        }

        if (c < maze[0].length - 1) {
            list.addAll(allDirections(p + 'R', maze, r, c + 1));
        }

        if (c > 0) {
            list.addAll(allDirections(p + 'L', maze, r, c - 1));
        }

        if (r > 0) {
            list.addAll(allDirections(p + 'U', maze, r - 1, c));
        }

        // * unlocking our cell
        maze[r][c] = true;

        return list;
    }
}
