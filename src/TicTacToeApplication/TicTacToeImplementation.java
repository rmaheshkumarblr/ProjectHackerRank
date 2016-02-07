package TicTacToeApplication;

import java.util.Scanner;

/**
 * Created by maheshkumar on 25 January 2016.
 */
public class TicTacToeImplementation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Allows for continues games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay)
        {
            System.out.println("Welcome to Tic Tac Toe! Tou are about to go against" +
                    " the master of Tic Tac Toe, Are you ready? I hope so!\n BUT FIRST, you " +
                    " must pick what character tou want to be and which character I will be");
            System.out.println();
            System.out.println("Enter a single character that will represent you on the board");
            char playerToken = scanner.next().charAt(0);
            System.out.println("Enter a single character that will represent your opponent on the board");
            char opponentToken = scanner.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            //Set up the game
            System.out.println();
            System.out.println("Now we can start the game. To play, enter a number and your token shall be put" +
                    " in its place.\nThe numbers go from 1-9, left to right, We shall see who will win this round.");
            TicTacToe.printIndexBoard();
            System.out.println();

            //Let's play
            while(game.gameOver().equals("notOver"))
            {
                if(game.currentMarker == game.userMarker)
                {
                    //User Turn
                    System.out.println("It's your turn! Enter a spot for your token");
                    int spot = scanner.nextInt();
                    while ( !game.playTurn(spot))
                    {
                        System.out.println("Try again, " + spot + " is invalid. This spot is already taken" +
                                " or it is out of range");
                        spot = scanner.nextInt();
                    }
                    System.out.println("You picked: " + spot + "!");
                }
                else
                {
                    //AI Turn
                    System.out.println("It's my turn");
                    //Pick Spot
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + "!");
                }
                //Print out new board
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();
            //Set up a new game or not depending on yhe response
            System.out.println("Do you want to play again? Enter Y if you do. " +
                    "Enter anything else if you are tired of me.");
            char response = scanner.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
            System.out.println();
            System.out.println();
        }
    }
}
