// Write a static method named isPrime that takes an integer n and returns true if n is prime, and false otherwise.

// A prime number is a number strictly greater than 1 that has no positive divisors other than 1 and itself.

public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
}
