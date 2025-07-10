package practice.cwh;

import java.util.Locale;

public class CH3_PR1 {
    public static void main(String[] args) {
        // Question 1
        String a = "Jay Shree Ram";
        a = a.toLowerCase();
        System.out.println(a);

        // Question 2
        String b = "Hello This Is My Laptop";
        System.out.println(b.replace(" ","_"));

        // Question 3
        String letter = "Dear <|name|>, Thanks a Lot!!!";
        letter = letter.replace("<|name|>","Shreeyash");
        System.out.println(letter);

        // Question 4
        String c = "This  string contains   double  and triple  spaces   .";
        System.out.println(c.indexOf("  "));
        System.out.println(c.indexOf("   "));

        // Question 5
        System.out.println("\"Dear Harry, This java cource is nice. Thanks...\"");
    }
}
