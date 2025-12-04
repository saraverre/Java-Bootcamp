package org.example;

public class TestsExercise {
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

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String reverseString(String text) {
        if (text == null) {
            return null;
        }
        return new StringBuilder(text).reverse().toString();
    }

    public static boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println(reversed);
        return text.equals(reversed);
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
       System.arraycopy(array1, 0, result, 0, array1.length);
       System.arraycopy(array2, 0, result, array1.length, array2.length);
       return result;
    }
}
