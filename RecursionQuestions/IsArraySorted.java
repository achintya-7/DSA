package RecursionQuestions;

public class IsArraySorted {
    public static void main(String[] args) {
        int [] arr = {23, 34, 45, 56, 55};
        System.out.println(isSorted(arr, arr.length));
    }

    static boolean isSorted(int [] arr, int n) {
        if (n == 1 || n == 0) {
            return true;
        }

        if (arr[n - 1] < arr[n - 2]) {
            return false;
        }

        return isSorted(arr, n - 1);
    } 
}
