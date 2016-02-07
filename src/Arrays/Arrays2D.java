package Arrays;

import java.util.Scanner;

/**
 * Created by maheshkumar on 12 January 2016.
 */
public class Arrays2D
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int maxSum = -10000 ;
        for( int i=1; i < 5 ; i++)
        {
            for( int j=1 ; j < 5 ; j++)
            {
                int sum = arr[i][j] + arr[i-1][j] + arr[i-1][j-1] + arr[i-1][j+1] + + arr[i+1][j] + arr[i+1][j-1] + arr[i+1][j+1] ;
                //System.out.print(arr[i][j]+" ") ;
                if ( maxSum == -10000 )
                {
                    maxSum = sum;
                }
                maxSum = Math.max(maxSum,sum);
            }
        }
        System.out.println(maxSum);
    }
}
