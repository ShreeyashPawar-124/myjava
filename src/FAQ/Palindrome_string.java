package FAQ;
import java.util.Scanner;
public class Palindrome_string {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();
        String rev ="";
        int count = str.length();
        for(int i=count-1;i>=0;i--){
            rev=rev + (str.charAt(i));
        }
        if (str.equals(rev)){
            System.out.println(str+"  String is Palindrome");
        }
        else System.out.println(str+"  String is Not Palindrome");
    }
}
