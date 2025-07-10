package practice.cwh;
import java.util.Scanner;
public class CH4_PR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Income:- ");
        float income = sc.nextInt();
        if (income <= 250000){
            System.out.println("Don't Need To Pay Any Tax");
        } else if (income > 250000 && income <= 500000) {
            float tax = income * 0.05f;
            System.out.println("You need to pay 5% tax:- "+tax);
        }
        else if (income > 500000 && income <= 100000) {
            float tax = income * 0.20f;
            System.out.println("You need to pay 20% tax:- "+tax);
        }
        else if (income > 1000000) {
            float tax = income * 0.30f;
            System.out.println("You need to pay 30% tax:- " + tax);
        }
    }
}
