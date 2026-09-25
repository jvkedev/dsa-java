// Inverted Alphabet Triangle Pattern

// A B C D E
// A B C D
// A B C
// A B
// A

public class InvertedAlphabetTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= (n + 1) - row; col++) {
                System.out.print((char) ('A' + col - 1) + " ");
            }

            System.out.println();
        }
    }
}
