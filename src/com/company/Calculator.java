package com.company;

public class Calculator {
    public static void mathSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum+" --> Result of a+b");
    }
    public static void mathMin(int a, int b) {
        int min = a - b;
        System.out.println(min+" --> Result of a-b");
    }
    public static void mathMult(int a, int b) {
        int mult = a * b;
        System.out.println(mult+" --> Result of a*b");
    }
    public static void mathDiv(double a, double b) {
        double div =  a / b;
        System.out.println(div+" --> Result of a/b");
    }
}