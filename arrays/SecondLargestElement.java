package arrays;

// Given an integer array arr of size n, find and return the second largest

// distinct element. Return -1 if it does not exist.

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int secondLargest = -1;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == largest) {
                continue;
            }
            if (!found || arr[i] > secondLargest) {
                secondLargest = arr[i];
                found = true;
            }
        }

        return found ? secondLargest : -1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 7, 1, 9, 4 };
        int[] arr2 = { 10, 10, 5, 5 };
        int[] arr3 = { 8, 8, 8 };
        int[] arr4 = { -5, -2, -10, -1 };
        int[] arr5 = { 42 };

        System.out.println(findSecondLargest(arr1)); // Expected: 7
        System.out.println(findSecondLargest(arr2)); // Expected: 5
        System.out.println(findSecondLargest(arr3)); // Expected: -1
        System.out.println(findSecondLargest(arr4)); // Expected: -2
        System.out.println(findSecondLargest(arr5)); // Expected: -1
    }
}
