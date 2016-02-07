package binarynumbers;

import java.util.Scanner;

/**
 * Created by maheshkumar on 10 January 2016.
 */
public class DecimalToBinary
{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for ( int i = 0 ; i < t ; i++)
        {
            String output = "" ;
            int n = scanner.nextInt();
            while ( n != 0)
            {
                output = n%2 + output ;
                //System.out.print(n%2);
                n = n / 2 ;
            }
            System.out.println(output);
        }
    }
}
