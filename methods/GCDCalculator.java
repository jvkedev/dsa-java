// Write a static method named gcd that accepts two non-negative integers a and b, and returns their greatest common divisor (the largest positive integer that divides both numbers evenly).

public class GCDCalculator {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;

            a = b;

            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(48, 18));
    }
}
