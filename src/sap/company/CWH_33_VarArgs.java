package sap.company;

public class CWH_33_VarArgs {

    // (Varargs) in Java is a method that takes a variable number of arguments
    // takes multiple arguments in method without initializing parameters for them
    // Datatype ...variable_name // syntax of varargs

    static int sum(int x,int ...arr){
        int result = x;
        for (int element:arr){
            result += element;
        }
        return result;
    }
    static int mul(int y,int ...array){
        int res = y;
        for (int e:array)
            res = res*e;
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial");
        System.out.println("The addition of numbers = "+sum(3,4,4,4,2));
        System.out.println("The sum of next numbers = "+sum(2,3,6));
        System.out.println("The multiplication of number = "+mul(2,2,3));
        System.out.println("The multiplication of number = "+mul(9,2,10));
    }
}