package arrays;

import java.util.Arrays;

// Given an integer array arr of size n, move all zeros to the end in place
// while keeping the relative order of the non-zero elements.

public class MoveZerosToEnd {
    public static void moveZeros(int[] arr) {
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }

        for (int i = k; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 0, 1, 0, 3, 12 };
        int[] arr2 = { 4, 0, 5, 0, 0, 6 };
        int[] arr3 = { 1, 2, 3 };
        int[] arr4 = { 0, 0, 0 };
        int[] arr5 = { 0 };

        moveZeros(arr1);
        moveZeros(arr2);
        moveZeros(arr3);
        moveZeros(arr4);
        moveZeros(arr5);

        System.out.println(Arrays.toString(arr1)); // Expected: [1, 3, 12, 0, 0]
        System.out.println(Arrays.toString(arr2)); // Expected: [4, 5, 6, 0, 0, 0]
        System.out.println(Arrays.toString(arr3)); // Expected: [1, 2, 3]
        System.out.println(Arrays.toString(arr4)); // Expected: [0, 0, 0]
        System.out.println(Arrays.toString(arr5)); // Expected: [0]
    }
}
