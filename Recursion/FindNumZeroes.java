package Recursion;

public class FindNumZeroes {
    public static void main(String[] args) {
        System.out.println(getZeroes(40023001));
    }

    static int getZeroes(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int count) {
        if (num == 0) {
            return count;
        }

        if (num % 10 == 0) {
            return helper(num/10, count+1);
        }

        return helper(num/10, count);
    }
}
