package recursion;

/**
 * Created by maheshkumar on 1/10/16.
 */
public class RecursionGoodLuck
{
    //f(f(f(f(x)))) --- x = 20
    //f(x) = 5 + x
    //f(20) = 5 + 20 = 25

    //f(f(f(25)))
    //f(f(30))
    //f(35)
    //40

    // 5 ==> 5+4+3+2+1 ;

    public static int Summation(int n)
    {
        //Base Case: We are at the end
        if ( n <= 0 )
        {
            return 0;
        }
        //Recursive Case: Keep Going
        else
        {
            return n + Summation(n-1);
        }
    }

    public static int Factorial(int n)
    {
        //Base Case:
        if ( n<= 1)
        {
            return 1;
        }
        //Recursion Case:
        else
        {
            return n * Factorial(n-1);
        }
    }

    public static int exponentiation(int n,int p)
    {
        //Base case:
        if ( p <= 0)
        {
            return 1;
        }
        else
        {
            return n * exponentiation(n,p-1);
        }

    }

    public static void main(String[] args)
    {
        System.out.println(Summation(3));
        System.out.println(Factorial(5));
        System.out.println(exponentiation(5,3));
    }
}
