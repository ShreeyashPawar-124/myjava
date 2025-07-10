package com.company;
import java.util.Scanner;
import java.util.Random;
class Game{
    int randomNumber;
    int userInput;
    public Game(){
        Random num = new Random();
        randomNumber = num.nextInt(100);
    }
    public void getNum(){
        System.out.println(randomNumber);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }
    public void isCorrectNumber() {
            for (int i = 0; i <=100; i++) {
                System.out.print("Guess The Number:- " + userInput);
                if (randomNumber > userInput) {
                    System.out.println("Your number is Smaller");
                    break;
                } else if (randomNumber < userInput) {
                    System.out.println("Your Number is Greater");
                    break;
                } else System.out.println("Congratulation Correct Guess!!!");
            }
    }
}
public class IMP_GuessTheNumber {
    public static void main(String[] args) {
        Game guess = new Game();
        guess.getNum();
        guess.takeUserInput();
        guess.isCorrectNumber();
    }
}
