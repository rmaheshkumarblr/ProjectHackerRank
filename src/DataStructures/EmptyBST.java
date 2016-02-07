package DataStructures;

/**
 * Created by maheshkumar on 23 January 2016.
 */
public class EmptyBST<D extends Comparable> implements Tree<D>
{

    public EmptyBST()
    {

    }
    @Override
    public boolean isEmpty()
    {
        return true;
    }

    @Override
    public int cardinality()
    {
        return 0;
    }

    @Override
    public boolean member(D element)
    {
        return false;
    }

    @Override
    public NonEmptyBST<D> add(D element)
    {
        return new NonEmptyBST<D>(element);
    }
}
