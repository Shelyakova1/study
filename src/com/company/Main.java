package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //вывод в консоль
        //System.out.println(25);
        System.out.println("Hello World!");

        int value1 = 0;
        int value2 = 5;
        int sum = value1 + value2;
        System.out.println("Сумма " + sum);
        int mulyiply = value1 * value2;
        System.out.println("Произведение " + mulyiply);
        int difference = value1 - value2;
        System.out.println("Разность " + difference);

        Scanner scanner = new Scanner(System.in);
        //String userInput = scanner.next();
        String userInput = new Scanner(System.in).next();
        System.out.println(userInput);
        int a = 7;
        int b = 8;
        sum(a, b); //15
        sum(3, a); //10
        sum(5, 23); //28

        // TODO did something
        boolean aGreaterThenB = a > b;
        boolean aLessThenB = a < b;
        boolean aGreaterOrEqualThenB = a >= b;
        boolean aLessOrEqualThenB = a <= b;


        if (aGreaterThenB) {
            System.out.println("a > b");
        } else {
            System.out.println("False");
        }
        if (aLessThenB) {
            System.out.println("a < b");
        }
        if (aGreaterOrEqualThenB) {
            System.out.println("a >= b");
        }
        if (aLessOrEqualThenB) {
            System.out.println("a <= b");
        } else {
            System.out.println("False");
        }

        int userInput1 = new Scanner(System.in).nextInt();
        if (userInput1 % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }

    }

    static void sum(int x, int y) {
        int z = (x + y);
        System.out.println(z);
    }
}