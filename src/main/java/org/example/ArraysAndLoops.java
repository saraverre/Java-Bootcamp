package org.example;

public class ArraysAndLoops {
    public static void main() {
        String[] names = new String[2];
        names[0] = "Maxi";
        names[1] = "Max";

        String[] names2 = {"Maxi", "Max"};

        // for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello " + names[i]);
        }

        //foreach loop
        for (String name : names) {
            System.out.println("Bye " + name);
        }

        // ex. easy.1
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //ex. easy.2
        String[] names3 = {"Ab",  "Bc", "Cd", "De", "Ef"};
        for (String name : names3) {
            System.out.println(name);
        }

        //ex. easy.3
        int[] numbers2 = {2, 4, 6, 8};

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]*numbers2[i]);
        }

        // ex. medium.1
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] % 2 == 0) {
                System.out.println(numbers3[i]);
            }
        }

        for (int number : numbers3) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        // ex. medium.2
        int[] numbers4 = {18, 56, 54, 25, 86, 78, 88, 19, 10};
        int sum = 0;

        for (int number : numbers4) {
            sum+=number;
        }

        System.out.println(sum);

        // ex. medium.3
        String[] cities = {"Hamburg", "Berlin", "München", "Köln"};

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + " has index " + i);
        }

        // ex. medium.4
        int[] numbers5 = {18, 56, 54, 25, 86, 78, 88, 19, 10};
        int min = numbers5[0];
        int max = numbers5[0];

        for (int number : numbers5) {
            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("smallest: " + min +  ", largest: " + max);
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
