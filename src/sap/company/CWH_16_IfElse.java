package sap.company;
import java.util.Scanner;

public class CWH_16_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age :- ");
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("Yes you can drive");
        }
        else {
            System.out.println("No you cant drive yet");
        }
        // Logical Operators in If else statements
        Boolean a = true;
        boolean b = false;
        // Logical AND
        if (a && b){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        // Logical OR
        if (a || b){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        // Logical NOT
        if (age!=18){
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }
    }
}
