package com.company;

import java.util.Scanner;

public class IMP_FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number Terms: ");
        int n = scan.nextInt();
        System.out.println("Fibonacci Series Up To "+n+" Terms: ");
        // initializing first two variables of fibonacci series
        int a = 0;
        int b = 1;
        for (int i=0;i<n;i++){
            System.out.print(a+" ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
