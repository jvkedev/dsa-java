// Solid Diamond Patter

//      *
//    * * *
//   * * * * *
// * * * * * * *
//   * * * * *
//    * * *
//      *

public class SolidDiamond {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col2 = 1; col2 <= 2 * row - 1; col2++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int row2 = 1; row2 <= n - 1; row2++) {
            for (int col3 = 1; col3 <= row2; col3++) {
                System.out.print("  ");
            }

            for (int col4 = 1; col4 <= 2 * (n - row2) - 1; col4++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
