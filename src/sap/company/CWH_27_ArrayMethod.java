package sap.company;

public class CWH_27_ArrayMethod {
    public static void main(String[] args) {
        int[] array = {34,56,77,86};
        // Method to calculate the length of array
        int a = array.length;
        System.out.println(a);

        // method to display array
        // Naive way = simple way
        System.out.println("Display using Naive method");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        // display using for loop
        System.out.println("Display using For loop in reverse order ");
        for (int i = array.length -1;i>=0;i--){
            System.out.println(array[i]);
            }
        // Displaying array using for each loop
        System.out.println("Display using For each loop");
        for (int k:array){
            System.out.println(k);
        }
    }
}
