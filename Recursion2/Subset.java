package Recursion2;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(listSubset("", str));
    }

    static void printSubset(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        printSubset(p, up.substring(1));
        printSubset(ch + p, up.substring(1));
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
