// * * * * * * *
//   * * * * *
//     * * *
//       *
//     * * *
//   * * * * *
// * * * * * * *

public class HourGlass {
    public static void main(String[] args) {
        int n = 7;
        int m = (n + 1) / 2;
        int o = m - 1;

        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }

            for (int col2 = 1; col2 <= 2 * (m - row) + 1; col2++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int row = 1; row <= o; row++) {
            for (int col = 1; col <= o - row; col++) {
                System.out.print("  ");
            }

            for (int col2 = 1; col2 <= (2 * row) + 1; col2++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
