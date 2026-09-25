// Reverse Alphabet Right-Angle Triangle Pattern

// E
// E D
// E D C
// E D C B
// E D C B A

public class ReverseAlphabetRightAngleTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print((char) ('A' + 5 - col) + " ");
            }

            System.out.println();
        }
    }
}
