package com.arash.ariani.problem1;

import java.util.Scanner;

public class FindMaximumFromThreeNumbers {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = scanner.nextInt();
        System.out.println("Enter second number:");
        b = scanner.nextInt();
        System.out.println("Enter third number:");
        c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Maximum is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Maximum is " + b);
        } else {
            System.out.println("Maximum is " + c);
        }
    }
}
