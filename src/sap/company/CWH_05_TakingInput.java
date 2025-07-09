package sap.company;
//import external code
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args){
        System.out.println("Enter your full name :- ");
       Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str);

        System.out.println("Enter Your Birth Year");
        int a = sc.nextInt();
        System.out.println("Enter Current Year");
        int b = sc.nextInt();
        int age = b - a;
        System.out.print("Age = ");
        System.out.println(age);

    }
}
