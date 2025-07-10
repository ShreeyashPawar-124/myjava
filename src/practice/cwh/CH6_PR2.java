package practice.cwh;

public class CH6_PR2 {
    public static void main(String[] args) {
        // Question 4
        // WAP to add two matrices of 2x3
        int[][] matrix1={{1,2,3},{4,5,6}};
        int[][] matrix2={{1,5,2},{5,2,3}};
        int[][] result={{0,0,0},{0,0,0}};
        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1[i].length;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        // Question 5
        // WAP to reverse an array
        System.out.println("Successfully Printed!!!!\nArray In Reverse Order");
        int[] arr = {10,20,30,40,50};
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // Question 5
        // reverse array by swapping position or first element in array to last element in array
        // second element with last second element
        // Logic
        // swap a[i] with a[l-i-1]
        System.out.println("Successfully Reverse array by swapping ");
        int[] a = {1,2,3,4,5,6};
        int l = a.length;
        // Math.floorDiv method is use To make division Round off
        // Ex:- 5/2 = 2.5 by floorDiv 5/2 = 2
        int n = Math.floorDiv(l,2);
        int temp;
        for (int q=0;q<n;q++){
            // Here we do swapping
            // put a[q] in temp then temp a[q] is empty
            // put a[l-q-1] in empty a[q] now a[l-q-1] is empty
            // put temp in empty a[l-q-1]
            temp    = a[q];
            a[q]    = a[l-q-1];
            a[l-q-1]= temp;
        }
        for (int elements : a){
            System.out.print(elements+" ");
        }
    }
}
