package oasisproject.task2;

import java.util.Scanner;
import java.lang.Math;
public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //To Generate a random number between 0 to 100
        int answer =(int) (Math.random()*100)+1;

        //No of trials
        int trials = 5;

        //take input from user or we can say guess the number
        Boolean correct = false;
        System.out.println("I have selected a number between 1 to 100 .\nYou have 5 tries to guess the number.");


        //react according to user input
        while (trials>0){
            System.out.println("Enter your guess");
            int guess = sc.nextInt();
            trials--;
            if (guess == answer) {
                System.out.println("you have successfully entered the correct number that is"+answer+"\n\n || YOU WIN ||");
                break;
            } else if (guess > answer) {
                System.out.println("Your guessed number is greater than actual number. You have "+trials+" trials left.\n");
            }
            else if (guess < answer) {
                System.out.println(" your guessed number is less than actual number. you have "+ trials+" trails left.\n");
            }
        }

        //after unsucessful guesses
        if (correct == false) {
            System.out.println("You have no trials left.\nActual number was--" + answer + "\n\n || YOU LOSE ||");
        }
    }
}