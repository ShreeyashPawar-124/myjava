package practice.cwh;
import java.util.Scanner;

public class CH4_PR1 {
    public static void main(String[] args) {

        // Question 1
        int age = 10;
        if (age == 11) {
            System.out.println("I am 11 year old");
        } else {
            System.out.println("I am Not 11");
        }

        // Question 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your English Marks:- ");
        int English = sc.nextInt();
        System.out.print("Enter your Math Marks:- ");
        int Math = sc.nextInt();
        System.out.print("Enter your Science Marks:- ");
        int Science = sc.nextInt();
        float avg = (English+Math+Science)/3.0f;

        if (avg > 40 && English > 33 && Math > 33 && Science > 33) {
            System.out.println("Congrats you Passed the Exam");
        }
        else {
            System.out.println("Sorry, Better luck next time");
        }
        System.out.println("Your Average is:- "+avg);
    }
}