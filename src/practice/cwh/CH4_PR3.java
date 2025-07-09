package practice.cwh;

import java.util.Locale;
import java.util.Scanner;

public class CH4_PR3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        byte day = sc.nextByte();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        // Question 5
        System.out.print("Enter year you want to check:- ");
        int year = sc.nextInt();
        if (year %4==0){
            System.out.println("leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

        // Question 6
        Scanner str = new Scanner(System.in);
        System.out.println("Enter your Website Url");
        String s = str.nextLine();
       if (s.endsWith(".com")){
           System.out.println("Commercial Website");
       } else if (s.endsWith(".in")) {
           System.out.println("Indian Website");
       } else if (s.endsWith(".org")) {
           System.out.println("Organization Website");
       }
       else {
           System.out.println("Incorrect Url");
       }
    }
}
