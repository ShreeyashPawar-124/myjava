// Convert Kilometers into Miles
package practice.cwh;
import java.util.Scanner;

public class CH1_PR4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometers");
        float a = sc.nextFloat();
        float b = a*0.621371f;
        System.out.println(a+"  Kilometer is equal to " + b + " Miles");
    }
}
