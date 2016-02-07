package DataStructures;

import java.util.Random;

/**
 * Created by maheshkumar on 26 January 2016.
 */
public class Testers
{
    //Random Integers
    public static int rndInt(int min, int max)
    {
        Random rand = new Random();
        return rand.nextInt((max-min)+1)+min;
        //15 - 5 = 10 + 1 == 11 --> 0 to 10
        // +5(min) to the random number
    }

    //Random binary search trees
    public static Tree rndTree(int count)
    {
        if(count == 0)
        {
            return new EmptyBST();
        }
        else
        {
            return rndTree(count - 1).add(rndInt(0,50));
        }
    }

    //Unit Test for BinarySearchTree

    public static void checkIsEmpty(Tree t) throws Exception
    {
        //if the tree t is an instance of EmptyBST --> t.IsEmpty -> True
        //if the tree t is an instance of NonEmptyBST --> t.IsEmpty -> False
        if ( t instanceof EmptyBST)
        {
//            if (t.isEmpty())
//            {
//                System.out.println("All is good, the tree is an EmptyBST and it is empty");
//            }
            if (!t.isEmpty())
            {
                throw new Exception("Not good,EmptyBST is not Empty");
            }
        }
        else if ( t instanceof NonEmptyBST )
        {
//            if ( !t.isEmpty() )
//            {
//                System.out.println("All is good, the tree is NonEmptyBST and it is not empty!");
//            }
            if (t.isEmpty())
            {
                throw new Exception("Not good,NonEmptyBST is Empty");
            }

        }
    }

    public static void checkAddMemberCardinalityIsEmpty(Tree t, int x) throws Exception
    {
        //Checking multiple methods one after another.

        int nT = (t.add(x)).cardinality();
        //1)Either something was added -> adn the cardinality increased by one.
        if (nT == (t.cardinality() + 1))
        {
            if (t.member(x))
            {
                throw new Exception("The cardinality increased by 1, but the thing" +
                        " that was added was already a member of the tree");
            }
//            else
//            {
//                System.out.println("All is good, our cardinality increased and the thing wasn't in the tree");
//            }
        }
            //                      OR
            //2)The thing that was added was already there and therefore not really added
            //So the cardinality stayed the same.
        else if (nT == t.cardinality())
        {
            if (!t.member(x))
            {
                throw new Exception("The cardinality didn't increase by 1, but " +
                        "we added a new thing");
            }
//            else
//            {
//                System.out.println("All is good, the thing was in the tree already and our cardinality did not increase");
//            }
        }
        else
        {
                    throw new Exception("Something is wrong with our program");
        }
    }

}

