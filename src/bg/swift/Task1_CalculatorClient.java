package bg.swift;

import java.util.Scanner;

public class Task1_CalculatorClient {
    private double a;
    private double b;

    private static double sum(double a, double b) {
        return a + b;
    }

    private static double sub(double a, double b) {
        return a - b;
    }

    private static double mul(double a, double b) {
        return a * b;
    }

    private static double div(double a, double b) {
        return a / b;
    }

    private static double per(double a, double b) {
        return (b / a) * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.toUpperCase().contains("END")) {
                break;
            } else if (input.toUpperCase().contains("SUM")) {
                String[] strArray = input.split(" ");
                System.out.printf("%.3f%n", sum(Double.parseDouble(strArray[1]), Double.parseDouble(strArray[2])));
            } else if (input.toUpperCase().contains("SUB")) {
                String[] strArray = input.split(" ");
                System.out.printf("%.3f%n", sub(Double.parseDouble(strArray[1]), Double.parseDouble(strArray[2])));
            } else if (input.toUpperCase().contains("MUL")) {
                String[] strArray = input.split(" ");
                System.out.printf("%.3f%n", mul(Double.parseDouble(strArray[1]), Double.parseDouble(strArray[2])));
            } else if (input.toUpperCase().contains("DIV")) {
                String[] strArray = input.split(" ");
                System.out.printf("%.3f%n", div(Double.parseDouble(strArray[1]), Double.parseDouble(strArray[2])));
            } else if (input.toUpperCase().contains("PER")) {
                String[] strArray = input.split(" ");
                System.out.printf("%.3f%n", per(Double.parseDouble(strArray[1]), Double.parseDouble(strArray[2])));
            }
        }
    }
}