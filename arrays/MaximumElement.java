package arrays;

// Given an integer array arr of size n, find and return the maximum element in the array

public class MaximumElement {
    public static int findMax(int[] arr) {
        int largestNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largestNumber < arr[i]) {
                largestNumber = arr[i];
            }

        }

        return largestNumber;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 7, 1, 9, 4 };
        int[] arr2 = { -5, -2, -10, -1 };
        int[] arr3 = { 42 };

        System.out.println(findMax(arr1)); // Expected: 9
        System.out.println(findMax(arr2)); // Expected: -1
        System.out.println(findMax(arr3)); // Expected: 42
    }
}
