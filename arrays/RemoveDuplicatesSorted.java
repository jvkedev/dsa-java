package arrays;

import java.util.Arrays;

// Given a sorted integer array arr of size n, remove duplicates in place
// and return k, the number of unique elements.
// The first k positions must hold the unique elements in order.

public class RemoveDuplicatesSorted {
    public static int removeDuplicates(int[] arr) {
        int k = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 2, 3 };
        int[] arr2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] arr3 = { 5, 5, 5, 5 };
        int[] arr4 = { 1, 2, 3 };
        int[] arr5 = { 42 };

        int k1 = removeDuplicates(arr1);
        System.out.println(k1 + " " + Arrays.toString(Arrays.copyOf(arr1, k1))); // Expected: 3 [1, 2, 3]

        int k2 = removeDuplicates(arr2);
        System.out.println(k2 + " " + Arrays.toString(Arrays.copyOf(arr2, k2))); // Expected: 5 [0, 1, 2, 3, 4]

        int k3 = removeDuplicates(arr3);
        System.out.println(k3 + " " + Arrays.toString(Arrays.copyOf(arr3, k3))); // Expected: 1 [5]

        int k4 = removeDuplicates(arr4);
        System.out.println(k4 + " " + Arrays.toString(Arrays.copyOf(arr4, k4))); // Expected: 3 [1, 2, 3]

        int k5 = removeDuplicates(arr5);
        System.out.println(k5 + " " + Arrays.toString(Arrays.copyOf(arr5, k5))); // Expected: 1 [42]
    }
}
