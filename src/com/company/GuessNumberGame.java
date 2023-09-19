package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{

    public int noOfGuesses;
    public int number;
    public int input;

    public Game()
    {
        Random r = new Random();
        number = r.nextInt(100);
    }

    public void userInput()
    {
        System.out.println("Guess the number");
        noOfGuesses++;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

    }
    public boolean isCorrect()
    {
        if(number == input) {
            System.out.println("guess is correct");
            return true;
        }
        else if(number>input)
        {
            System.out.println("Guess is low.");
            return false;
        }
        else
        {
            System.out.println("Guess is High");
            return false;
        }

    }

    public void setNoOfGuesses(int a)
    {
        noOfGuesses = a;
    }
    public int getNoOfGuesses()
    {
        return noOfGuesses;
    }
}

public class GuessNumberGame {

    public static void main(String[] args) {

        Game g = new Game();
        boolean a = false;
        while (!a)
        {

            g.userInput();
            a = g.isCorrect();
        }
        System.out.println("the user guessed in "+g.noOfGuesses+" times.");

    }

}
