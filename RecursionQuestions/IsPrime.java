package RecursionQuestions;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isNumPrime(3, 2));
    }

    static boolean isNumPrime(int num, int i) {

        if (num <= 2) {
            return num == 2 ? true : false;
        }

        if (num % i == 0) {
            return false;
        }

        if (i * i > num) {
            return true;
        }

        return isNumPrime(num, i + 1);

    }
}
