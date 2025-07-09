package practice.cwh;

public class CH5_PR3 {
    public static void main(String[] args) {
        int a = 8;
        int sum = 0;
        for (int i = 1;i<=10;i++){
            int table = i*a;
            sum = sum+table;
        }
        System.out.printf("Sum of numbers occurs in %d's Table is = %d",a,sum);
        // Question No 10
        // WAP to sum first n even number using for loop
        System.out.println("\nSum of First n Even Numbers Using For Loop");
        int n = 5;
        int k = 0;
        for (int j=0;j<n;j++){
            System.out.println(j*2);
             k = k+j*2;
        }
        System.out.println("____");
        System.out.println(k);
    }
}
