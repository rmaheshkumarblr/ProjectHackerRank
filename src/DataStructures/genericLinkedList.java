package DataStructures;

/**
 * Created by maheshkumar on 21 January 2016.
 */
public class genericLinkedList <D>
{
    //Properties
    genericNode<D> head;
    int count;

    //Constructors
    public genericLinkedList()
    {
        this.head = null;
        this.count = 0;
    }

    public genericLinkedList(genericNode newHead)
    {
        this.head = newHead;
        this.count = 1;
    }

    //Methods

    //add
    public void add(D newData)
    {
        genericNode<D> temp = new genericNode(newData);
        genericNode<D> current = this.head;

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
    public D get(int index)
    {
        //Implemented below two cases using exception
//        if (index <= 0)
//        {
//            return -1;
//        }
//        else if ( index > this.count)
//        {
//            return -1;
//        }
        genericNode<D> current = this.head;
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
        genericNode<D> current = this.head;
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
        genericLinkedList<String> linkedList = new genericLinkedList<String>();
        linkedList.add("Mahesh");
        linkedList.add("Kumar");
        //System.out.println(linkedList.count);

        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

    }
}

