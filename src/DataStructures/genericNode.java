package DataStructures;

/**
 * Created by maheshkumar on 21 January 2016.
 */
public class genericNode <D>
{
//Generics allows the type of data to be anything
    genericNode<D> next;
    D data;

    public genericNode(D newData)
    {
        this.data = newData;
        this.next = null;
    }

    public genericNode(D newData, genericNode<D> newNext)
    {
        this.data = newData;
        this.next = newNext;
    }

    //Getters and Setters

    public D getData()
    {
        return data;
    }

    public genericNode getNext()
    {
        return next;
    }

    public void setData(D newData)
    {
        this.data = newData;
    }

    public void setNext(genericNode<D> newNode)
    {
        next = newNode ;
    }
}


