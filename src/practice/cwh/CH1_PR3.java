// Greet user by asking name
package practice.cwh;
import java.util.Scanner;

public class CH1_PR3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String str = sc.nextLine();
        System.out.println("Hello "+str+" have a great day !");
    }
}
