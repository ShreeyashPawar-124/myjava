package com.company;
import java.util.Random;
import java.util.Scanner;

public class IMP_RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
       Scanner sc = new Scanner(System.in);
        System.out.println("'0' For Rock \n'1' For Paper\n'2' For Scissor");
        for (int i=1;i<=5;i++){
            System.out.println(i+"___________________________");
            System.out.print("Enter Your Choice: ");
            int compChoice = random.nextInt(3);
            int userChoice = sc.nextInt();
            System.out.println(" Computers Choice: "+compChoice);
            if (userChoice == compChoice){
                System.out.println("\nDraw...");
            } else if (compChoice==0 && userChoice==1 || compChoice==1 && userChoice==2 || compChoice==2 && userChoice==0) {
                System.out.println("\nyou win!!!");
            }
            else if (userChoice > 2) {
                System.out.println("\nWrong Input");
            }
            else System.out.println("\nComputer Wins :) ");
        }
    }
}
