package org.example;

public class TestsExercise {
    public static void main(String[] args) {

    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static Character getFirstLetter(String text) {
        if (text == null || text.isBlank()) {
            return null;
        }
        return text.charAt(0);
    }

    public static int divide(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return number1 / number2;
    }
}
