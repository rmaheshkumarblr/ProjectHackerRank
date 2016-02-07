package generic;

/**
 * Created by maheshkumar on 21 January 2016.
 */

import java.util.Arrays;

/**
 * Created by maheshkumar on 1/10/16.
 */
public class ArrayPractice
{
//    public static void printArray(int[] array)
//    {
//        System.out.print("[");
//        for( int i=0 ; i<array.length ; i++)
//        {
//            int item = array[i];
//            System.out.print(item);
//            if ( i < array.length - 1)
//            {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }
//
//    public static void printArray(String[] array)
//    {
//        System.out.print("[");
//        for( int i=0 ; i<array.length ; i++)
//        {
//            String item = array[i];
//            System.out.print(item);
//            if ( i < array.length - 1)
//            {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }

    public static <E> void printArray(E[] array)
    {
        System.out.print("[");

        for (E element: array)
        {
            System.out.print(element + " ");
        }

//        for( int i=0 ; i<array.length ; i++)
//        {
//            E item = array[i];
//            System.out.print(item);
//            if ( i < array.length - 1)
//            {
//                System.out.print(", ");
//            }
//        }
        System.out.println("]");
    }


    public static <E, T> void printArray(E[] array, T b)
    {
        System.out.print("[");

        for (E element: array)
        {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }



    public static void main(String[] args)
    {

        //Index
        //Index ->  0 1 2 3 4 -> largest index is length - 1
        //Array -> [0,5,3,2,1] -> int length 5

        //Pull Random Objects from Array
        // Math.abs(rand.nextInt()) % 5
        //For an array of string you can only modify, you can't add to an existing array
        //You will need to create a new array if a new element must be added.

        //Different ways of initializing an array ( Declaring/Allocating and Initializing )
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        Integer[] intArray3 = {5, 2, 9, 1, 3};

        String[] stringArray1 = {"bananas","apples","oranges"} ;

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;

//        System.out.println(Arrays.toString(intArray2));
//        System.out.println(Arrays.toString(intArray3));

        //Custom print out arrays
        printArray(intArray2);
        printArray(intArray3);

        //Retrieve objects
//        System.out.println(intArray2[3]);

        //In-built functions - It sorts in the source ( no extra copy is made)
        Arrays.sort(intArray3);

        printArray(intArray3);
        printArray(stringArray1);

        //Special for loop: foreach

        for( String s: stringArray1)
        {
            System.out.println(s);
        }
    }
}

