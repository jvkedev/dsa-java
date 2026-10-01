// Write a static method named myPow that calculates double x raised to the power integer n ($x^n$).

public class PowerFunction {
    public static double myPow(double x, int n) {
        double value = 1;

        boolean isNegative = n < 0;

        if (isNegative) {
            n = -n;
        }

        for (int i = 1; i <= n; i++) {
            value = value * x;
        }

        if (isNegative) {
            value = 1 / value;
        }

        return value;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
}
