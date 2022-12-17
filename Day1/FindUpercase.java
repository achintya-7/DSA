package Day1;

public class FindUpercase {
    public static void main(String[] args) {
        String str = "mfDoom";
        System.out.println(firstUp(str));
    }

    static char firstUp(String string) {

        return helper(string, 0);
    }

    static char helper(String string, int index) {
        if (string.charAt(index) == '\0') {
            return '\0';
        }

        if (Character.isUpperCase(string.charAt(index))) {
            return string.charAt(index);
        }

        return helper(string, index+1);
    }



}
