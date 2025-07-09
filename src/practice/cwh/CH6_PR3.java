package practice.cwh;

public class CH6_PR3 {
    public static void main(String[] args) {
        // Question 6
        // Find Maximum element in array
        int[] arr = {23,34,45,56,67,78};
        int max = Integer.MIN_VALUE;
        for (int e:arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The maximum number in array is:- "+max);
        // Question 7
        // Find Minimum element in array
        int min = Integer.MAX_VALUE;
        for (int element:arr){
            if (element<min){
                min = element;
            }
        }
        System.out.println("The minimum number in array is:- "+min);
        // Question 8
        // check array is sorted or not
        int b =0;
        boolean check=true;
        for (int j=0;j<arr.length-1;j++){
            if (arr[j]>arr[j+1]){
                check=false;
                break;
            }
            }
        if (check){
            System.out.println("The array is sorted");
        }
        else System.out.println("The array is not sorted");
        }
    }
