package exceptionspractice;

import java.util.*;
import java.io.*;

/**
 * Created by maheshkumar on 17 January 2016.
 */
class nonNegativeNumbers extends Exception {
    public nonNegativeNumbers(String msg){
        super(msg);
    }
}

class Calculator
{
    public int power(int n, int p) throws nonNegativeNumbers
    {
        if( n<0 || p<0 )
        {
            throw new nonNegativeNumbers("n and p should be non-negative");
        }
        else
        {
            return (int) Math.pow(n,p);
        }

    }
}

class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}