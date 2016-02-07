package TicTacToeApplication;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by maheshkumar on 25 January 2016.
 */
public class AI
{
    public int pickSpot(TicTacToe game)
    {
        ArrayList<Integer> choices = new ArrayList<Integer>();
        for ( int i=0 ; i < 9 ; i++ )
        {
            //If the slot is not taken, add it as a choice.
            if(game.board[i] == '-')
            {
                choices.add(i+1);
            }
        }
        Random rand = new Random();
        int choice = choices.get(Math.abs(rand.nextInt() % choices.size()));
        return choice;
    }
}
