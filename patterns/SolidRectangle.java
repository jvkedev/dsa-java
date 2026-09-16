// Solid Rectangle Pattern

// * * * * *
// * * * * *
// * * * * *

public class SolidRectangle {
    public static void main(String[] args) {
        int n = 3;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
