package sap.company;

public class CWH_09_AssociativityPrecedence {
    public static void main(String[] args) {
        int x = 2*4-30/5;
        // * and / have same precedence and associativity is left to right
        //  a = 8-5/30
        //  a = 8-6
        //  a = 2
        int y = 2/4-30*5;
        // b = 0-30*5
        // b = 0-150
        // b = -150
        System.out.println(x);
        System.out.println(y);

        //quick quiz
        int a = 2;
        int b = 6;
        int c = 4;

        int ans = b*b-(4*a*c)/(2*a);
        System.out.println(ans);
    }
}
