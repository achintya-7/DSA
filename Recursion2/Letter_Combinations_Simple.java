package Recursion2;

import java.util.ArrayList;

public class Letter_Combinations_Simple {
    public static void main(String[] args) {
        System.out.println(phoneCombination("", "123"));
    }

    static ArrayList<String> phoneCombination(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; // * '9' - '0' = 9

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) { // * 1 : {a, b, c}, 2 : {d, e, f}, 3 : {g, h, i}.....
            char ch = (char) ('a' + i);
            list.addAll(phoneCombination(p + ch, up.substring(1)));
        }

        return list;

    }
}
