package hangmanapplication;

import interfacePractice.Character;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by maheshkumar on 25 January 2016.
 */
public class HangmanApplication
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hangman! I will pick a word and you will try to guess it" +
                ".\nIf you guess wrong 6 times, " +
                " character by character" +
                " then I win. \nIf you guess it before then, you win. " +
                "Are you ready? I hope so because I am");
        System.out.println();
        System.out.println("I have picked my word. \nBelow is a picture, and below that is" +
                " your current guess, which starts off as nothing. \nEvery time you" +
                " guess incorrectly, I add a body part to the picture. \nWhen there is full" +
                " person, you will lose.");
        boolean doYouWantToPlay = true ;
        while ( doYouWantToPlay )
        {
            //Setting up the game
            System.out.println("Alright! Let's play!");
            Hangman game = new Hangman();

            do
            {
                //Draw the things...
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord);
                System.out.println();

                //Get the guess
                System.out.println("Enter a character that you think is in the word");
                char guess = (sc.next().toLowerCase()).charAt(0);
                System.out.println();

                //Check if the character is guessed already
                while ( game.isGuessedAlready(guess) )
                {
                    System.out.println("Try again! You've already guessed that character.");
                    guess = ( sc.next().toLowerCase().charAt(0) );
                }

                //Play the game
                if ( game.playGuess(guess) )
                {
                    System.out.println("Great guess! That character is in the word!");
                }
                else
                {
                    System.out.println("Unfortunately that character isn't in the word!");
                }




            }
            while ( !game.gameOver() );

            System.out.println();
            System.out.println("Do you want to play another game? Enter Y if you do.");
            char response = (sc.next().toUpperCase()).charAt(0);
            doYouWantToPlay = ( response == 'Y') ;
        }
    }
}
