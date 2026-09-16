// Solid Pyramid Pattern

//       *
//     * * *
//   * * * * *
// * * * * * * *

public class SolidPyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col2 = 1; col2 <= row + (row - 1); col2++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
