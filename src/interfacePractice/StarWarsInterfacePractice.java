package interfacePractice;

import java.util.Random;

/**
 * Created by maheshkumar on 19 January 2016.
 */
public class StarWarsInterfacePractice
{
    public static Character summonCharacter()
    {
        Random rand = new Random();
        if ( Math.abs(rand.nextInt()) % 2  == 0 )
        {
            return new Enemy();
        }
        else
        {
            return new Hero();
        }
    }

    public static void main(String[] args)
    {
        Enemy darthVader = new Enemy();
        Hero obiWanKenobi = new Hero();
        darthVader.attack();
        obiWanKenobi.attack();
        darthVader.heal();
        obiWanKenobi.heal();
        System.out.println("Enemy weapon: " + darthVader.getWeapon());
        System.out.println("Hero weapon: " + obiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}
