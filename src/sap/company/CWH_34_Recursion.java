package sap.company;

import java.util.Scanner;

public class CWH_34_Recursion {
    // Create a method that finds factorial of a number using recursion
    // formula for factorial = n = n * factorial(n-1);
    // A program is called recursive when an entity calls itself
    static int factorial_recursion(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n = n * factorial_recursion(n-1);
        }
    }
    // Create a method that finds factorial of number using iterative method
    // A program is called iterative when there is a loop (or repetition).
    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int res = 1;
            for (int i=1;i<=n;i++){
                res *= i ;
            }
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial:-");
        int a = sc.nextInt();
        System.out.println("Factorial of "+a+" is = "+factorial_recursion(a));
        System.out.println("Return factorial using iteration = "+factorial_iterative(a));
    }
}
