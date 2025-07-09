package FAQ;
import java.util.Scanner;

public class Reverse_a_number {
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    // USING ALGORITHM

    int rev=0;
    while(num != 0){
        rev = rev*10 + num%10;
        num = num/10;
    }
    System.out.println("Reversed number is: "+rev);

    // USING FUNCTION STRING BUFFER

//    StringBuffer sb = new StringBuffer(String.valueOf(num));
//    StringBuffer rev = sb.reverse();
//    System.out.println(rev);

    // USING FUNCTION STRING BUILDER

//    StringBuilder sbl = new StringBuilder();
//    StringBuilder rev = sbl.append(num);
//    sbl.reverse();
//    System.out.println(rev);
}
}
