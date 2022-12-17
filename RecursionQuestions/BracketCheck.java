package RecursionQuestions;

/*
 * 
 * Check if the brackets balance out
 * 
 * Input : exp = “[()]{}{[()()]()}”
 * Output : true
 
 * Input : exp = “[(])”
 * Output : false
 */

public class BracketCheck{
    public static void main(String[] args) {
        System.out.println(checkBrackets("", "[()]{}{}"));
    }

    static boolean checkBrackets(String p, String up) {

        if (up.isEmpty()) {
            if (p.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }

        char c = up.charAt(0);
        p = p + c;
        up = up.substring(1);

        if (p.length() >= 2) {
            if(p.charAt(p.length() - 1) == p.charAt(p.length() - 2)) {
                return checkBrackets(p.substring(0, p.length() - 1), up);
            }
        }

        return checkBrackets(p, up);


    }

     
}