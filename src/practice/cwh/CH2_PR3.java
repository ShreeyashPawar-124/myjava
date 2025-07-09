package practice.cwh;
import java.util.Scanner;
public class CH2_PR3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int givenNumber = 50;
        System.out.print("Enter your number :- ");
        int userNumber = sc.nextInt();
        System.out.println(givenNumber < userNumber);
    }
}
