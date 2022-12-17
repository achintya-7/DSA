package RecursionQuestions;

import java.util.ArrayList;
import java.util.Arrays;

//  Power set in lexicographical order. 
//  Examples: 
//  Input:abc 
//  Output:a ab abc ac b bc c

public class Subset_in_Lex {
    public static void main(String[] args) {
        String input = "bca";
        char [] arr = input.toCharArray();
        Arrays.sort(arr);
        String newString = new String(arr);
        System.out.println(listSubset("", newString));
    }

    static ArrayList<String> listSubset(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = listSubset(p + ch, up.substring(1));
        ArrayList<String> right = listSubset(p, up.substring(1));

        left.addAll(right);

        return left;

    }
}
