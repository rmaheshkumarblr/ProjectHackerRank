package Loops;

/**
 * Created by maheshkumar on 1/10/16.
 */
public class Loops
{
    public static void practiceWhileLoop()
    {
        int x = 0;
        while (x < 5)
        {
            System.out.println("The value of x is " + x);
            x++ ;
        }
    }

    public static void practiseDoWhileLoop()
    {
        int x = 0;
        do
        {
            System.out.println("The value of x is " + x);
            x++;
        }
        while ( x < 10 );
    }

    public static void practiseForLoop()
    {
        for (int x = 0 ; x < 20 ; x++ )
        {
//            System.out.println("The value of x is " + x);
//            if ( x == 10 )
//            {
//                break;
//            }
            for ( int y = 0 ; y < 10 ; y ++)
            {
                System.out.println("("+x+","+y+")");
            }
        }
    }

    public static void main(String[] args)
    {
//        practiceWhileLoop();
//        practiseDoWhileLoop();
        practiseForLoop();
    }
}
