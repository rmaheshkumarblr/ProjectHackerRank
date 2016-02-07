package DataStructures;

/**
 * Created by maheshkumar on 15 January 2016.
 */

//Generics allows the type of data to be anything
public class Node
{
    Node next;
    int data;

    public Node(int newData)
    {
        this.data = newData;
        this.next = null;
    }

    public Node(int newData, Node newNext)
    {
        this.data = newData;
        this.next = newNext;
    }

    //Getters and Setters

    public int getData()
    {
        return data;
    }

    public Node getNext()
    {
        return next;
    }

    public void setData(int newData)
    {
        this.data = newData;
    }

    public void setNext(Node newNode)
    {
        next = newNode ;
    }
}


