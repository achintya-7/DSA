package ArrayQuestions;

import java.util.*;

public class test {
    public static void main(String[] args) {
        int [] arr = {40, 10, 20, 20};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
        
    }

    public static int[] arrayRankTransform(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        int[] ans = new int[arr.length];

        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list);

        for (int i = 0; i < arr.length; i++) {
            ans[i] = list.indexOf(arr[i]) + 1;
        }

        System.out.println(list);

        return ans;

    }
}
