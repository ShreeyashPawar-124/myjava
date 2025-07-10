package practice.cwh;
import java.util.Scanner;

public class CH6_PR1 {
    public static void main(String[] args) {

        // Question 1
        // Print the sum of float array

        float[] arr = {34.5f,45.4f,34.23f,76.06f,11.03f};
        float sum = 0;
       for(int i = 0;i<arr.length;i++){
           sum = sum + arr[i];
       }
        System.out.print("Sum of Array:- ");
        System.out.println(sum);

        // Question 2
        // WAP to check given integer is presents in array or not

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check:- ");
        float n = sc.nextFloat();
        boolean b = false;
        for (float element:arr){
            if (n==element){
                b = true;
                break;
            }
        }
        if (b){
            System.out.println("The Number is Present");
        }
        else System.out.println("The number is Not Present");

        // Question 3
        // Calculate average marks of an array containing all students marks in physics
        float[] physics = {78,81,98,84,67};
        float mark =0;
        float avg = 0;
        for (float element:physics){
            mark = mark+element;
        }
        avg=mark/(physics.length);
        System.out.println("Average marks in Physics:- "+avg);
    }
}
