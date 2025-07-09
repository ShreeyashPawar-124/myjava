package sap.company;

public class CWH_10_ResultingDataType {
    public static void main(String[] args) {
        // quick quiz
        int a = 23;
        int b = 24;
        System.out.println(a++); //first print then increment
        System.out.println(a);
        System.out.println(++b); //first increment then print
        System.out.println(b);

        //quick quiz
        int y = 7;
        int x = ++y * 8;        // ++ have more precedence than *
        System.out.println(x);

        // How it works on Characters
        char ch = 'B';
        System.out.println(++ch);
    }
}
