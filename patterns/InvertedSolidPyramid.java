// Inverted Solid Pyramid Pattern

// * * * * * * *
//   * * * * *
//     * * *
//       * 

public class InvertedSolidPyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }

            for (int col2 = 1; col2 <= 2 * (n - row) + 1; col2++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
