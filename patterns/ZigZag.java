// Zig-Zag Pattern

//     *       *
//   *   *   *   *
// *       *       *

public class ZigZag {

    public static void main(String[] args) {

        int n = 3;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= 9; col++) {

                if ((row + col) % 4 == 0 || 
                    (row == 2 && col % 4 == 0)) {

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
