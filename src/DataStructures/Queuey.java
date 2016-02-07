package DataStructures;

import java.util.LinkedList;
/**
 * Created by maheshkumar on 18 January 2016.
 */
public class Queuey
{
    LinkedList queue; // = new LinkedList();

    //Making a queue instance
    public Queuey()
    {
        queue = new LinkedList();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public int size()
    {
        return queue.size();
    }

    public void enqueue(int n)
    {
        queue.addLast(n);
    }

    public int dequeue()
    {
        return (int) queue.removeFirst();
    }

    public int peek()
    {
        return (int) queue.get(0);
    }


    public static void main(String[] args)
    {
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First Out: " + numberQueue.dequeue());
        System.out.println("Peek at second item: " + numberQueue.peek());
        System.out.println("Second Out: " + numberQueue.dequeue());
        System.out.println("Third Out: " + numberQueue.dequeue() );
    }
}
