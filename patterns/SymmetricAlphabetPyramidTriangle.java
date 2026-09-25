// Symmetric Alphabet Pyramid Pattern

//       A
//     A B A
//   A B C B A
// A B C D C B A

class SymmetricAlphabetPyramidTriangle {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col2 = 1; col2 <= (2 * row) - 1; col2++) {
                if (col2 <= row) {
                    System.out.print((char) ('A' + col2 - 1) + " ");
                } else {
                    System.out.print((char) ('A' + (2 * row - 1) - col2) + " ");
                }
            }

            System.out.println();
        }
    }
}