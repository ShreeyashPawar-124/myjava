package sap.company;
import java.util.Scanner;

public class CWH_13_Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String str = scan.nextLine();
       // String name = new String("Shreeyash");
        String name = "Shreeyash";
        System.out.println("Hello "+str+"!!!");
        System.out.print("I am ");
        System.out.println(name);

        // different ways to print in java
        //print() , println() , printf() , format()
        int a = 4;
        float b = 6.87f;
        System.out.printf("The value of variable a = %d and The value of variable b = %.2f",a,b);
        // printf() and format() works same
        System.out.format(" The value of variable a = %d and The value of variable b = %.2f",a,b);

    }
}
