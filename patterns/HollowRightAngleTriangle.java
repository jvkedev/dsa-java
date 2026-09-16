// Hollow Right-Angle Triangle Pattern

// *
// * *
// *   *
// *     *
// * * * * *

public class HollowRightAngleTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (row == n || col == 1 || col == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
