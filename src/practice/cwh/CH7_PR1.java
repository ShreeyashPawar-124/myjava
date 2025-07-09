package practice.cwh;
import java.util.Scanner;

public class CH7_PR1 {
    // 1.Method to Print table of number n
    static void tableOff(int n) {
        int res ;
        for (int i = 1; i <= 10; i++) {
            res = i * n;
            System.out.printf("%dX%d = %d\n", n, i, res);
        }
    }
    // 2.Method to print star pattern of n numbers
    static void pattern1(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    // 3.WAP to print sum of first n natural numbers using recursive method
    static int sum(int n){
        if (n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    // 4.Method to print inverted star pattern
    static void pattern2(int n){
        for (int i=n;i>=0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // 5.Write a method to print fibonacci series up to (n)th term
    static void fibonacci(int n){
        int fib1=0;
        int fib2=1;
        for (int i=1;i<=n;i++){
            System.out.print(fib1+" ");
            int temp = fib1+fib2;
            fib1 = fib2;
            fib2 = temp;
        }
    }
    // 5.print n th number in fibonacci series
    static int fibonacci2(int n){
        if (n==1||n==2){
            return n-1;
        }
        else {
            return fibonacci2(n - 1) + fibonacci2(n - 2);
        }
    }
    // 6.Find average of set of numbers passes as arguments
    static float average(float ...arr){
        float total=0;
        for (float element:arr){
            total += element;
        }
        return total/arr.length;
    }
    // 7. Method to print inverted star pattern using recursion
    static void star_pattern_inverted(int n,int b){
        if (n==0) return;
        if(b<n){
                System.out.print("* ");
                star_pattern_inverted(n,b+1);
            }
        else {
            System.out.println();
            star_pattern_inverted(n-1,0);
        }
    }
    // 7. Method to print inverted star pattern using recursion
    static void recursion_star_inverted(int n){
        if (n==0)return;
        System.out.println("* ".repeat(n));
        recursion_star_inverted(n-1);
    }
    // 8. Method to print star pattern of n numbers using recursion
    static void star_pattern(int n){
        if (n>0){
            star_pattern(n-1);
            System.out.println();
            for (int i=0;i<n;i++){
                System.out.print("* ");
            }
        }
    }
    // 9. Celsius To Fahrenheit
    static void celsiusToFahrenheit(float n){
        //  °F = (°C × 9/5) + 32.
        float f ;
        f = (n*9/5)+32.0f;
        System.out.format("%.0f°C = %.2f°F.",n,f);
    }
    // 10. 3.WAP to print sum of first n natural numbers using iterative approach
    static int sum_iterative(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res = res + i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print a number For Table:- ");
        int m = sc.nextInt();
        tableOff(m);
        pattern1(4);
        pattern1(3);
        int c = sum(7);
        System.out.println(c);
        pattern2(4);
        pattern2(3);
        fibonacci(4);
        fibonacci(3);
        int k = fibonacci2(7);
        System.out.println("\n"+k);
       float b = average(72,64,94,10,37f);
        System.out.println(b);
        star_pattern(7);
        System.out.println();
        star_pattern_inverted(4,0);
        recursion_star_inverted(2);
        celsiusToFahrenheit(m);
          int u = sum_iterative(5);
        System.out.println("Sum of First Five Natural Numbers:- "+u);
        int z = sum_iterative(4);
        System.out.println("Sum of First four Natural Numbers:- "+z);
    }
}
