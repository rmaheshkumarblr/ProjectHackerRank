package DataStructures;

/**
 * Created by maheshkumar on 23 January 2016.
 */
public class NonEmptyBST<D extends Comparable> implements Tree<D>
{
    D data;
    Tree<D> left;
    Tree<D> right;

    public NonEmptyBST(D element)
    {
        data = element;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }

    public NonEmptyBST(D element, Tree<D> leftTree, Tree<D> rightTree)
    {
        data = element;
        left = leftTree;
        right = rightTree;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public int cardinality()
    {
        return 1 + left.cardinality() + right.cardinality();
    }

    @Override
    public boolean member(D element)
    {
        if (data == element)
        {
            return true;
        } else
        {
            if (element.compareTo(data) < 0)
            {
                return left.member(element);
            } else
            {
                return right.member(element);
            }
        }
    }

    @Override
    public NonEmptyBST<D> add(D element)
    {
        if (data == element)
        {
            return this;
        } else
        {
            if (element.compareTo(data) < 0)
            {
                return new NonEmptyBST<D>(data, left.add(element), right);
            } else
            {
                return new NonEmptyBST<D>(data, left, right.add(element));
            }
        }
    }
}
