// Pascal’s Triangle Pattern

// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {

            int value = 1;

            for (int col = 1; col <= row; col++) {

                System.out.print(value + " ");

                value = value * (row - col) / col;

            }

            System.out.println();
        }
    }
}
