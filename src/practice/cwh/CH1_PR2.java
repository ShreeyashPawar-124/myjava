// Find CGPA of 3 subjects
package practice.cwh;
import java.util.Scanner;
public class CH1_PR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in English");
        float a = sc.nextFloat();
        System.out.println("Enter marks in Math");
        float b = sc.nextFloat();
        System.out.println("Enter marks in Science");
        float c = sc.nextFloat();
        float cgpa =(( a+b+c)/3)/10;
        System.out.print("CGPA = ");
        System.out.println(cgpa);
    }
}
