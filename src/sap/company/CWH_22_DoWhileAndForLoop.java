package sap.company;

public class CWH_22_DoWhileAndForLoop {
    public static void main(String[] args) {
        // Do While Loop
        byte b = 1;
        do {
            System.out.println(b);
            b++;
        }while (b <= 3);
        System.out.println("End Do While");
        // For loop
        for (byte a=0; a<=3; a++){
            System.out.println(a);
        }
        System.out.println("End For");

        //Quick Quiz (WAP for first 10 odd numbers)
        //logic
        // 2*n   = 0, 2, 4, 6, 8
        // 2*n+1 = 1, 3, 5, 7, 9
       // byte k = 10;
        byte n = 3;
        for (byte i=0; i<n; i++){
            System.out.println(2*i+1);
        }
        System.out.println("Here are first five ODD number");
        // Quick Quiz (WAP to Print n natural number in Reverse order)
        // Decrementing for loop
        int num = 5;
        for (int i=num; i>0;i--){
            System.out.println(i);
        }
    }
}
