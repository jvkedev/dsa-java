// Write a standalone Java method named isEven that accepts a single integer n as an argument and returns a boolean (true if the number is even, and false if it is odd).

class EvenOrOddChecker {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
    }
}