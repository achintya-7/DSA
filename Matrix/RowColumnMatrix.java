package Matrix;

import java.util.Arrays;

public class RowColumnMatrix{
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {12, 22, 32, 42},
            {14, 24, 34, 44},
            {15, 26, 36, 45}
        };

        System.out.println(Arrays.toString(search(arr, 34)));
    }

    static int[] search(int [][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            } 
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}