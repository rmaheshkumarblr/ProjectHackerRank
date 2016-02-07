package Print;

/**
 * Created by maheshkumar on 1/6/16.
 */
import java.io.*;
import java.util.*;
public class Print {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for ( int i = 1 ; i<= N ; i++)
        {
            String content = "" ;
            for ( int j = 1 ; j <= i ; j ++ )
            {
                content += "#" ;
            }
            System.out.printf("%"+N+"s", content);
            System.out.println();
        }
    }
}