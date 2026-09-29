// Write a static method named countFactors that accepts a positive integer n and returns the total count of its factors (divisors).

// A factor is any integer that divides n completely with no remainder (n % i == 0).

public class CountFactors {
    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countFactors(6));
    }
}
