package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 23, 32, 12, 32, 23};
        int target = 32;
        // findAllIndex(arr, target, 0);
        // System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(findAllIndex2(arr, target, 0, list2));
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        
        if (index == arr.length) {
            return;
        }
        
        if (target == arr[index]) {
            list.add(index);
        } 
        
        findAllIndex(arr, target, index + 1);
        
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list2) {

        if (index == arr.length) {
            return list2;
        }

        if (target == arr[index]) {
            list2.add(index);
        }

        return findAllIndex2(arr, target, index + 1, list2);

    }
}
