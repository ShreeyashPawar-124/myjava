package sap.company;

public class CWH_26_Arrays {
    public static void main(String[] args) {

        // Declaration type 1
        // declare first then memory allocation

        int [] marks;
        marks =new int[5];
        marks[0]=34;
        marks[1]=35;
        marks[2]=89;
        marks[3]=23;
        marks[4]=45;
        System.out.println(marks[3]);

        // Declaration type 2
        // declaration + memory allocation

        int[] mark = new int[5];
        mark[0]=34;
        mark[1]=35;
        mark[2]=83;
        mark[3]=23;
        mark[4]=45;
        System.out.println(mark[4]);

        // Declaration type 3
        // declaration + memory allocation + initialization

        int [] score = {23,45,76,89,72};
        System.out.println(score[3]);
    }
}
