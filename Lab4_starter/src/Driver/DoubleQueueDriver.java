package Driver;

import com.gradescope.DoubleQueue.code.*;

import java.util.Scanner;

public class DoubleQueueDriver
{
    public static void main(String[] args)
    {

        IDoubleQueue myQueue;

        Scanner keyboard = new Scanner(System.in);
        int ans = 0;

        do
        {
            System.out.println("Enter 1 for the array implementation or 2 for the arrayList implementation.");
            ans = keyboard.nextInt();
        }while(ans != 1 && ans != 2);

        if(ans==1)
        {
            System.out.println("Initializing queue as array size 10...");
            myQueue = new ArrayDoubleQueue(10);
            System.out.println("Class:" + myQueue.getClass());

        }
        else
        {
            System.out.println("Initializing queue as arrayList...");
            myQueue = new ListDoubleQueue(10);
        }

        System.out.println("\nEnqueuing 6 values");
        myQueue.enqueue(1.0);
        myQueue.enqueue(1.5);
        myQueue.enqueue(2.0);
        myQueue.enqueue(2.5);
        myQueue.enqueue(3.0);
        myQueue.enqueue(3.5);

        System.out.println("\nCurrent Queue: " + myQueue);

        System.out.println("\nNew Queue Length: " + myQueue.length());

        Double removed = myQueue.dequeue();
        System.out.println("\nCalling Dequeue. Value returned: [" + removed + "]");

        System.out.println("\nNew Queue Length: " + myQueue.length());

        System.out.println("\nCurrent Queue: " + myQueue);

        System.out.println("\nAdding the Dequeued value back to the Queue...");

        myQueue.enqueue(removed);

        System.out.println("\nFinal Queue: " + myQueue);

    }




}
