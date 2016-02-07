package recursion;

import java.util.Scanner;

/**
 * Created by maheshkumar on 1/10/16.
 */
public class EuclidGCD
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //Take Input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
    static  int find_gcd(int a,int b)
    {
        //Write the base condition
        if ( a == b)
        {
            return a;
        }
        else
        {
            int c = Math.max(a,b) - Math.min(a,b);
            int d = Math.min(a,b);
            return find_gcd(c,d);
        }

    }
}
