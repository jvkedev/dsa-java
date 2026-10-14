package arrays;

import java.util.Arrays;

// Given an integer array arr of size n, reverse the array in place using two pointers

public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];

            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 10, 20, 30, 40 };
        int[] arr3 = { 7 };

        reverse(arr1);
        reverse(arr2);
        reverse(arr3);

        System.out.println(Arrays.toString(arr1)); // Expected: [5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(arr2)); // Expected: [40, 30, 20, 10]
        System.out.println(Arrays.toString(arr3)); // Expected: [7]
    }
}