package practice.cwh;

public class CH5_PR2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 4;
        int i = 1;
        while (i<=n){
            int evenNum = 2*i;
            sum = sum+(2*i);
            i++;
            System.out.println(evenNum);
        }
        System.out.println("Sum of first "+ n +" even number is:- "+sum);

        // Question 3 Multiplication Table for Given number
        int k = 9;
        for (int j =1;j<=10;j++){
            int table = j*k;
            System.out.println(j+"x"+k+" = "+table);
        }
        // Question 4 table in reverse order
        System.out.println("Table in reverse order....");
        int a = 5;
        for (int b = 10;b>0;b--){
            int c = a*b;
            System.out.println(b+"x"+a+" = "+c);
        }
        // Question 5 Factorial
        int q = 5;
        int factorial=1;
        for (int w=1;w<=q;w++){
             factorial = factorial*w;
        }
        System.out.println("Factorial of "+q+" = "+factorial);
        // Question 6 factorial using while loop
        int e=6,r=1,t=1;
        while (r<=e){
            t = t * r;
            r++;
        }
        System.out.printf("Factorial of %d = %d",e,t);
    }
}




