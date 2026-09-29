// Write a static method named reverse that takes an integer n and returns the reversed number.

class ReverseNumber {
    public static int reverse(int n) {
        boolean isNegative = n < 0;

        if (isNegative) {
            n = -n;
        }

        int revNumber = 0;
        while (n > 0) {

            revNumber = revNumber * 10 + n % 10;

            n = n / 10;

        }

        if (isNegative) {
            revNumber = -revNumber;
        }

        return revNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-1234));
    }
}