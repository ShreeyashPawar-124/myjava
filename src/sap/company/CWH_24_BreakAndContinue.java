package sap.company;

public class CWH_24_BreakAndContinue {
    public static void main(String[] args) {
        // Break in for loop
        System.out.println("BREAK IN FOR LOOP");
        for (int i = 1;i<=5;i++){
            System.out.println(i+". Hello guys!!");
            if (i==3){
                System.out.println("Break occurs.....");
                System.out.println("In For loop...");
                break;
            }
        }
        // Continue in for loop
        System.out.println("CONTINUE IN FOR LOOP");
        for (int j = 1;j<=5;j++){
            if (j==2){
                System.out.println(j+". continue works...");
                continue;
            }
            System.out.println(j+". hey...");
        }
        // Continue in while loop
        System.out.println("CONTINUE IN FOR LOOP");
        int k = 0;
        while (k < 5){
            k++;     // In Continue statement increment variable at the top of conditional statements
            if (k == 3){
                System.out.println("continue works in while loop....");
                continue;
            }
            System.out.println(k+". Hie...");
        }
        // Break in Do while
        System.out.println("BREAK IN DO WHILE LOOP");
        int y = 0;
        do {
            System.out.println(y+". Good Morning");
            y++;    // Do Increment as per condition to get output as you need
            if (y==2) {
                System.out.println(y+". Good Afternoon");
                System.out.println("Break occurs....");
                break;
            }
        }while (y<5);
    }
}
