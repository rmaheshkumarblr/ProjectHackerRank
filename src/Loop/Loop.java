package Loop;

/**
 * Created by maheshkumar on 1/6/16.
 */
import java.io.*;
import java.util.*;

public class Loop {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for ( int i=0; i < T; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int N = sc.nextInt();

            for ( int j=0 ; j < N ; j++ )
            {
                int overall = a ;
                for ( int k=0 ; k <=j ; k ++ )
                {
                    overall += (int) ( Math.pow(2,k) * b) ;
                }
                System.out.print(overall + " " );
            }
            System.out.println();

        }

    }
}