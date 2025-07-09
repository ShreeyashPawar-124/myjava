package sap.company;
import java.util.Scanner;

public class CWH_18_LadderAndSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        if(age < 5){
            System.out.println("Baby");
        }
        else if (age < 17) {
            System.out.println("Teenager");
        }
        else if (age < 60) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Old");
        }
        // Switch Case
        switch (age){
            case 18:
                System.out.println("Adult Now");
                break;
            case 23:
                System.out.println("Need To get a job");
                break;
            case 60:
                System.out.println("You Need To Retire");
                break;
            default:
                System.out.println("Enjoy Your Life");
        }
    }
}
