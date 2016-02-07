package pointerRelated;

import static pointerRelated.HairColor.* ;
/**
 * Created by maheshkumar on 20 January 2016.
 */
public class Person
{
    HairColor hairColor = BLACK ;

    public Person()
    {
        int a = 5;

    }

    public static void main(String[] args)
    {
        Person peterParker = new Person();
        Person spiderMan = peterParker; // Just a pointer pointing to the same location/memory address -- Aliasing

        peterParker.hairColor = RED ;

        System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of Spider Man: " + spiderMan.hairColor );
    }
}
