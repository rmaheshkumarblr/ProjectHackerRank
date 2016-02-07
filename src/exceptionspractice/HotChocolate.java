package exceptionspractice;

import java.util.concurrent.TimeUnit;

/**
 * Created by maheshkumar on 18 January 2016.
 */
public class HotChocolate
{
    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException,TooColdException
    {
        if(cocoaTemp>=tooHot)
        {
            throw new TooHotException();
        }
        else if (cocoaTemp<=tooCold)
        {
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        double currentCocoaTemp = 150;
        boolean wrongTemp = true;
        while( wrongTemp )
        {
            try
            {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("That cocoa was good!");
                wrongTemp = false;
            }
            catch (TooColdException e1)
            {
                System.out.println("THAT'S TOO COLD!!");
                currentCocoaTemp += 5;
            }
            catch (TooHotException e2)
            {
                System.out.println("THAT's TOO HOT!!");
                currentCocoaTemp -= 5;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("And it's gone");

    }
}
