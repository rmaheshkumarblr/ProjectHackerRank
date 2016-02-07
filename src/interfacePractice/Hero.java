package interfacePractice;

/**
 * Created by maheshkumar on 19 January 2016.
 */
public class Hero implements Character
{
    public String weapon = "lightsaber";

    @Override
    public void attack()
    {
        System.out.println("The hero attacks the enemy");
    }

    @Override
    public void heal()
    {
        System.out.println("The hero heals you");
    }

    @Override
    public String getWeapon()
    {
        return weapon;
    }
}
