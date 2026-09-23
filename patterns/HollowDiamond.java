// Hollow Diamond Pattern

//       *
//     *   *
//   *       *
// *           *
//   *       *
//     *   *
//       *

public class HollowDiamond {
    public static void main(String[] args) {
        int n = 4;

        // Upper hollow part
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col2 = 1; col2 <= (2 * row) - 1; col2++) {
                if (col2 == 1 || col2 == (2 * row) - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }

        // Bottom hollow part
        for (int row = 1; row <= n - 1; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }

            for (int col2 = 1; col2 <= 2 * (n - row) - 1; col2++) {
                if (col2 == 1 || col2 == 2 * (n - row) - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
