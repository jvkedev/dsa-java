// Alphabet Triangle Pattern

// A
// A B
// A B C
// A B C D
// A B C D E

public class AlphabetTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print((char) ('A' + col - 1) + " ");

            }

            System.out.println();
        }
    }
}
