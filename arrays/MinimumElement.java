package arrays;

// Given an integer array arr of size n, find and return the minimum element in the array

public class MinimumElement {
    public static int findMin(int[] arr) {
        int smallestNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (smallestNumber > arr[i]) {
                smallestNumber = arr[i];
            }
        }

        return smallestNumber;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 7, 1, 9, 4 };
        int[] arr2 = { -5, -2, -10, -1 };
        int[] arr3 = { 42 };

        System.out.println(findMin(arr1)); // Expected: 1
        System.out.println(findMin(arr2)); // Expected: -10
        System.out.println(findMin(arr3)); // Expected: 42
    }
}