package John_Manuel.Projects;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        runGame();
    }

    public static void runGame()
    {
        //setting up scanner object
        Scanner inputScanner = new Scanner(System.in);

        //setting minimum number and max here for the user to guess between
        int minNum = 1;
        int maxNum = 20;

        //setting how my guesses the user has before they loose
        int tries = 6;

        //getting random number, making sure it's at least 1
        int randomNumber = (int)(Math.random()*(maxNum-minNum)+minNum);

        //on launch greeting
        System.out.println("Hello! Welcome to my guessing game!");
        System.out.println("to get started; what is your name?");
        //get users name
        String playerName = inputScanner.nextLine();
        //saying hello to user
        System.out.println("well, " + playerName + ", I am thinking of a number between 1 and 20");
        System.out.println("take a guess");

        //start the looping with the outer layer being the attempts
        for(int i = 0; i <= tries; i++)
        {
            int playerGuess = inputScanner.nextInt();

            //starting checks for what the player guessed vs the number generated
            if(randomNumber > playerGuess && i != tries - 1)
            {
            System.out.println("Try guessing higher");
            }
            else if(randomNumber < playerGuess && i != tries - 1)
            {
                System.out.println("Try guessing lower");
            }
            else if(randomNumber == playerGuess)
            {
                System.out.println("Good job, " + playerName + "! You guessed my number in " + i + " guesses!");
                System.out.println("would you like to play again? (y or n)");
                String continuing = inputScanner.nextLine();
                if(continuing.equals("n"))
                {
                    break;
                }
                else if(continuing.equals("y"))
                {
                    System.out.println("Sorry that isn't implemented yet");
                }
            }

            if(i == tries)
            {
                System.out.println("Sorry " + playerName + ", you ran out of attempts");
                System.out.println("the number I was thinking of was " + randomNumber);
            }
        }
    }
}
