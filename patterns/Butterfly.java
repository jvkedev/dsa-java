// Butterfly Pattern

// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *

public class Butterfly {
    public static void main(String[] args) {
        int n = 8;
        int m = n / 2;

        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            for (int col2 = 1; col2 <= n - (2 * row); col2++) {
                System.out.print("  ");
            }

            for (int col3 = 1; col3 <= row; col3++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= (m + 1) - row; col++) {
                System.out.print("* ");
            }

            for (int col2 = 1; col2 <= (2 * row) - 2; col2++) {
                System.out.print("  ");
            }

            for (int col3 = 1; col3 <= (m + 1) - row; col3++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
