package DataStructures;

/**
 * Created by maheshkumar on 23 January 2016.
 */
public interface Tree<D extends Comparable>
{
    public boolean isEmpty();
    public int cardinality(); //Size
    public boolean member(D element);
    public NonEmptyBST<D> add(D element);

}
