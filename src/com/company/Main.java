package com.company;

public class Main {

    public static void main(String[] args) {
        //1
        String name = "Olga";
        System.out.println("Всем привет! Меня зовут " + name);
        System.out.println();
        //2
        double x = 0.25;
        double y = 0.9;
        System.out.println(10 * x + y);
        System.out.println((20 - y) * x);
        System.out.println(33 - (y + x));
        System.out.println();
        //3
        double a = 5;
        double b = 3;
        System.out.println("Average is " + (a + b) / 2);
        System.out.println();
        //4
        double A = 200;
        double discountA = 15;
        double AWithDiscount = A - A * discountA / 100;
        double B = 30;
        double result;
        result = (10 * AWithDiscount) + (2 * B);
        System.out.println("Final sum " + result);
        System.out.println();
        //5
        int n = -10;
        System.out.println("Module of " + n + " is " + module(n));
        System.out.println();
        //6
        double sum = 81;
        System.out.println(finalSum(sum));
    }

    public static int module(int n) {
        if (n >= 0) {
            return n;
        } else   {
            return -n;
        }
    }

    public static double finalSum(double sum) {
        if (sum > 20 && sum <= 50) {
            double discount3 = 3;
            return sum - sum * discount3 / 100;
        } else if (sum > 50 && sum <= 80) {
            double discount5 = 5;
            return sum - sum * discount5 / 100;
        } else if (sum > 80) {
            double discount7 = 7;
            return sum - sum * discount7 / 100;
        } else {
            return sum;
        }
    }
}