package RecursionQuestions;

/*
     * REMOVE CONSECUTIVE DUPLICATES
     * Input: S= “aaaaabbbbbb”
     * Output: ab
     * 
     * Input: S = “geeksforgeeks”
     * Output: geksforgeks
     * 
     * Input: S = “aabccba”
     * Output: abcba
*/

public class Remove_Consecutive_Duplicate {
    public static void main(String[] args) {
        System.out.println(pAndUp("", "geeksforgeeks"));
    }

    static String pAndUp(String p, String up) {
        if (up.length() <= 1) {
            return p + up;
        }

        if (up.charAt(0) == up.charAt(1)) {
            return pAndUp(p, up.substring(1));
        }

        return pAndUp(p + up.charAt(0), up.substring(1));
    }
}
