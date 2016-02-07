package cointoss;

import java.util.Random;

/**
 * Created by maheshkumar on 1/3/16.
 */
public class coinToss
{
    public String tossACoint()
    {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2 ;
//        return toss ;
        if(toss == 0)
        {
            return "HEAD";
        }
        else
        {
            return "TAIL";
        }
    }

    public static void main(String[] args)
    {
        coinToss game = new coinToss();
        System.out.println(game.tossACoint());
        System.out.println(game.tossACoint());
        System.out.println(game.tossACoint());
        System.out.println(game.tossACoint());
        System.out.println(game.tossACoint());
        System.out.println(game.tossACoint());
        System.out.println(game.tossACoint());
        System.out.println(game.tossACoint());
        System.out.println(game.tossACoint());
    }
}

