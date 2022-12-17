package Recursion2;

import java.util.ArrayList;

public class Dice_Sum {
    public static void main(String[] args) {
        System.out.println(dice("", 10));;
    }

    static ArrayList<String> dice(String p, int target) {

        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(dice(p + i, target - i));
        }

        return list;
    }
}
