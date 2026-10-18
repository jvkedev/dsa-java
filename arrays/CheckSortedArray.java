package arrays;

public class CheckSortedArray {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 3, 2, 4 };
        int[] arr3 = { 2, 2, 5, 5, 9 };
        int[] arr4 = { 5, 4, 3, 2, 1 };
        int[] arr5 = { 42 };

        System.out.println(isSorted(arr1)); // Expected: true
        System.out.println(isSorted(arr2)); // Expected: false
        System.out.println(isSorted(arr3)); // Expected: true
        System.out.println(isSorted(arr4)); // Expected: false
        System.out.println(isSorted(arr5)); // Expected: true
    }
}
