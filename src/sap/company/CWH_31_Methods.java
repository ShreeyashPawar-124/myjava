package sap.company;

public class CWH_31_Methods {
      static int addSub(int a,int b){
         int c;
         if (a<b) {
             c = a + b;
         }
         else c = a - b;
         return c;
    }
    public static void main(String[] args) {
         int a = 8;
         int b = 9;
//          If you do not use static method then you need to create object of that class
//         CWH_31_Methods obj = new CWH_31_Methods();
//         obj.addSub(a,b);
         int c =addSub(a,b);
        System.out.println(c);
    }
}
