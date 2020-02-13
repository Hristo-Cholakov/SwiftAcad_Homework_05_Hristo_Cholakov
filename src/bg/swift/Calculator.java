package bg.swift;

public class Calculator {
    private int a;
    private int b;

    private static int sum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    private static int subtract(int a, int b) {
        int difference = a - b;
        return difference;
    }

    private static int multiply(int a, int b) {
        return a*b;
    }

    private static int divide(int a, int b) {
        return a/b;
    }

    private static int percentOf(int a, int b) {
        return (b/a)*100;
    }

    public static void main(String[] args) {
        System.out.printf("Sum is %d%n ", sum(1, 3));
        System.out.printf("Difference is %d%n ", subtract(1, 3));
        System.out.printf("Multiplication is %d%n ", multiply(1, 3));
        System.out.printf("Division is %d%n ", divide(1, 3));
        System.out.printf("Percentage is %d%n ", percentOf(1, 3));
    }
}
