package Recursion;

public class MaxAndMin {
    public static void main(String[] args) {
        int [] arr = {10, 20, 3, 4, 21};
        int n = arr.length;

        System.out.println(maxNumber(arr, n));

    }   

    public static int minNumber(int arr[], int n) {
        if ( n == 1 ) {
            return n;
        }

        return Math.min(arr[n-1], minNumber(arr, n-1));
    }

    public static int maxNumber(int arr[], int n) {
        if (n == 1) {
            return n;
        }

        return Math.max(arr[n - 1], minNumber(arr, n - 1));
    }


}
