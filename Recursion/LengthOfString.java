package Recursion;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "mfDoom";
        System.out.println(lengthOfString(str));
    }

    static int lengthOfString(String str) {
        return helper(str, 0);
    }

    static int helper(String str, int index) {
        if (str.length() <= index || str.charAt(index) == '\0') {
            return index;
        }

        return helper(str, index+1);
    }
}
