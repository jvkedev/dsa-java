// Hollow Pyramid Pattern

//         *
//       *   *
//     *       *
//   *           *
// * * * * * * * * *

public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");

            }
            for (int col2 = 1; col2 <= 2 * row - 1; col2++) {
                if (col2 == 1 || col2 == 2 * row - 1 || row == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }
    }
}
