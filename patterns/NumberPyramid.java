// Number Pyramid Pattern

//       1
//     2 2 2
//   3 3 3 3 3
// 4 4 4 4 4 4 4

public class NumberPyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col2 = 1; col2 <= (2 * row) - 1; col2++) {
                System.out.print(row + " ");
            }

            System.out.println();
        }
    }
}
