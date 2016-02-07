package DataStructures;

/**
 * Created by maheshkumar on 23 January 2016.
 */
public class BinarySearchTree
{
    public static void main(String[] args) throws Exception
    {
        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(5);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);

        Testers.checkAddMemberCardinalityIsEmpty(e,5);
        Testers.checkAddMemberCardinalityIsEmpty(n,5);
        Testers.checkAddMemberCardinalityIsEmpty(n,6);

        int tests = 1000;
        for ( int i=0; i<tests ; i++)
        {
            Tree t;
            if ( i % 10 == 0 )
            {
                t = Testers.rndTree(0);
            }
            else
            {
                t = Testers.rndTree(10);
            }
            Testers.checkAddMemberCardinalityIsEmpty(t, i);
        }
    }
}
