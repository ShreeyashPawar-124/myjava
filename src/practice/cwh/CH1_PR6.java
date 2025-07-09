// CBSC Calculator Percentage For 5 Subject
package practice.cwh;
import java.util.Scanner;
public class CH1_PR6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Marks of One Subject:");
        float total = sc.nextFloat();
        System.out.print("Enter marks of Subject 1 :- ");
        float a = sc.nextFloat();
        System.out.print("Enter marks of Subject 2 :- ");
        float b = sc.nextFloat();
        System.out.print("Enter marks of Subject 3 :- ");
        float c = sc.nextFloat();
        System.out.print("Enter marks of Subject 4 :- ");
        float d = sc.nextFloat();
        System.out.print("Enter marks of Subject 5 :- ");
        float e = sc.nextFloat();
        float percent = ((a+b+c+d+e)/(total*5))*100;
        System.out.println("Percentage : "+percent+"%");
    }
}
