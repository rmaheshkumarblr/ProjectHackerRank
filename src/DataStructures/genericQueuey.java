package DataStructures;

import java.util.LinkedList;

/**
 * Created by maheshkumar on 21 January 2016.
 */
public class genericQueuey <D>
{
    LinkedList<D> queue; // = new LinkedList();

    //Making a queue instance
    public genericQueuey()
    {
        queue = new java.util.LinkedList();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public int size()
    {
        return queue.size();
    }

    public void enqueue(D n)
    {
        queue.addLast(n);
    }

    public D dequeue()
    {
        return queue.removeFirst();
    }

    public D peek()
    {
        return queue.get(0);
    }


    public static void main(String[] args)
    {
        genericQueuey stringQueue = new genericQueuey();
        stringQueue.enqueue("Hi");
        stringQueue.enqueue("There");
        System.out.print(stringQueue.dequeue() + " ");
        System.out.println(stringQueue.dequeue() + ".");


        genericQueuey numberQueue = new genericQueuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First Out: " + numberQueue.dequeue());
        System.out.println("Peek at second item: " + numberQueue.peek());
        System.out.println("Second Out: " + numberQueue.dequeue());
        System.out.println("Third Out: " + numberQueue.dequeue() );
    }
}

