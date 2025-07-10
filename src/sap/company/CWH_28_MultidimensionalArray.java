package sap.company;

public class CWH_28_MultidimensionalArray {
    public static void main(String[] args) {
        int [][] arr = new int [3][3];
        arr [0][0]=101;
        arr [0][1]=102;
        arr [0][2]=103;
        arr [1][0]=201;
        arr [1][1]=202;
        arr [1][2]=203;
        arr [2][0]=301;
        arr [2][1]=302;
        arr [2][2]=303;
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
