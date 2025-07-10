package FAQ;

public class Swap_2Number {
    public static void main(String []args){
        int a=10,b=20;
        // logic 1 using temporary variable
       System.out.println("Before swapping a="+a+" b="+b);
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After swapping a="+a+" b="+b);
        // logic 2 without using third variable
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("After swapping a="+a+" b="+b);
        // logic 3 using mul & div
//        a=a*b;
//        b=a/b;
//        a=a/b;
//        System.out.println("After swapping a="+a+" b="+b);
        // logic 4 using XOR
//        a = a^b;
//        b = b^a;
//        a = a^b;
//        System.out.println("After swapping by XOR a="+a+" b="+b);

        // logic 5 single line
        b = a+b - (a=b);
        System.out.println("After swapping a="+a+" b="+b);

    }
}

