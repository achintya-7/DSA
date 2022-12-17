package RecursionQuestions;

import java.util.ArrayList;

public class PalindromicPartition {
    public static void main(String[] args) {
        ArrayList<String> subsets = subsetList("", "nitin");
        ArrayList<String> ans = new ArrayList<>();

        for (String string : subsets) {
            if (isPalindrome(string)) {
                ans.add(string);
            }
        }

        System.out.println(ans);
    }

    static ArrayList<String> subsetList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        char c = up.charAt(0);

        ArrayList<String> leftList = subsetList(p + c, up.substring(1));
        ArrayList<String> rightList = subsetList(p, up.substring(1));

        list.addAll(leftList);
        list.addAll(rightList);
        
        return list;
    }

    

    static boolean isPalindrome(String str) {
        int len = str.length() - 1;

        if (len <= 0) {
            return true;
        }

        int i = 0;
        while (i < len) {       
            if (str.charAt(i) != str.charAt(len)) {
                return false;
            }
            i++;
            len--;
        }
        return true;
    }
}
