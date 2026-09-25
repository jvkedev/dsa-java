// Floyd’s Triangle Pattern

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

public class FloydTriangle {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(i++ + " ");
            }

            System.out.println();
        }
    }
}
