package com.company;
import java.util.Scanner;

public class TCS_q1 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int r = 1;
        String str = sc.next();
        int a = str.length();
       // System.out.println(a);
        for (int i = a; i >= 1; i--) {
            r = r * i;
        }
        System.out.println(r);
    }
}
