package DataStructures;

/**
 * Created by maheshkumar on 15 January 2016.
 */
public class LinkedList
{
    //Properties
    Node head;
    int count;

    //Constructors
    public LinkedList()
    {
        this.head = null;
        this.count = 0;
    }

    public LinkedList(Node newHead)
    {
        this.head = newHead;
        this.count = 1;
    }

    //Methods

    //add
    public void add(int newData)
    {
        Node temp = new Node(newData);
        Node current = this.head;

        if( isEmpty() )
        {
            this.head = temp;
            this.count++ ;
        }
        else
        {
            //if current is null, then it cannot understand what .getNext() is so we need to check first ^
            while (current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(temp);
            this.count++;
        }
    }

    //get
    public int get(int index)
    {
        if (index <= 0)
        {
            return -1;
        }
        else if ( index > this.count)
        {
            return -1;
        }
        Node current = this.head;
        for ( int i=1 ; i<index ; i++)
        {
            current = current.getNext();
        }
        return current.getData();
    }

    //size
    public int size()
    {
        return this.count;
    }

    //isEmpty
    public boolean isEmpty()
    {
        return this.head==null;
    }

    //remove
    public void remove()
    {
        //remove from the back of the list
        Node current = this.head;
        if ( this.count > 2)
        {
            while( current.getNext().getNext() != null )
            {
                current = current.getNext();
            }
            current.setNext(null);
            this.count-- ;
        }
        else if ( this.count == 2)
        {
            current.setNext(null);
            this.count-- ;
        }
        else if ( this.count == 1)
        {
            this.head = null;
            this.count--;
        }
        else
        {
            System.out.println("There is no element to remove!");
        }
    }

    public static void main(String[] args)
    {
        // Linkedlist is present by default
        // LinkedList<String> linkedList = new LinkedList<String>();
    }
}
