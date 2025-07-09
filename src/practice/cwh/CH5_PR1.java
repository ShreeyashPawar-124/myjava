package practice.cwh;

import java.util.Scanner;

public class CH5_PR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number:- ");
        int n = sc.nextInt();
        // inverted star pattern using for loop
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        // star pattern using for loop
        for (int i=0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        // inverted star pattern using While loop

        System.out.println("\n");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A Number:- ");
        int b = s.nextInt();
        while (b>0){
            int c =0;
            while (c<b){
                System.out.print(" *");
                c++;
            }
            System.out.print("\n");
            b--;
        }
    }
}
