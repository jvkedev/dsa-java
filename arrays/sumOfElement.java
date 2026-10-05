package arrays;

// Sum of all the elements in the array.

public class sumOfElement {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 9, 3, 6 };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
