package sap.company;

public class CWH_32_MethodOverloading {
//    static int change(int a){
//        return a = 45;
//    }
//    static int change2(int[] a){
//        return a[0] = 87;
//    }

    // METHOD OVERLOADING
    static void foo(){
        System.out.println("Hello brother");
    }
    static void foo(int a){
        System.out.println("Hello to "+a+" brothers");
    }
    static void foo(int a ,int b){
        System.out.println("Hello "+a+" Hello "+b);
    }

    public static void main(String[] args) {
//        // integer value never change by method
//        // because is stores value in variable
//        int a = 50;
//        change(a);
//        System.out.println(a);
//
//        // value in array can be changed
//        // because array is stored in references not in variable
//        int [] arr ={23,45,67,76,87};
//        change2(arr);
//        System.out.println(arr[0]);
        foo();
        foo(20);
        foo(2,5);
    }
}
