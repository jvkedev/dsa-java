// Rhombus Pattern

//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *

public class Rhombus {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=  n - row; col++) {
                System.out.print("  ");
            }

            for (int col2 = 1; col2 <= n; col2++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
