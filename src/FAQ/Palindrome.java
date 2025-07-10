package FAQ;
import java.util.Scanner;

public class Palindrome {
    public static void main (String []arg){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int num = sc.nextInt();
       int orig_num = num;
       int rev = 0;
       while (num!=0){
           rev = rev*10+num%10;
           num = num/10;
       }
       if(orig_num==rev){
           System.out.println(rev+" is a Palindrome Number");
       }
       else System.out.println(rev+" is Not a Palindrome Number");
    }
}
