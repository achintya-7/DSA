package Recursion;

public class SkipString {
    public static void main(String[] args) {
        // it will skip isd from the string
        System.out.println(skipWithString("vnisdnvev", "isd"));
    }

    public static String skipWithString(String str, String query) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith(query)) {
            return skipWithString(str.substring(query.length()), query);
        } else {
            return str.charAt(0) + skipWithString(str.substring(1), query);
        }
    }
}


