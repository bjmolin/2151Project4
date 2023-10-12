package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**ListDoubleQueueContract
 *
 *
 * @invariant: maxListSize > 0
 *
 * @corresponds: max_queue_size = maxListSize
 *
 */
public class ListDoubleQueue<T> implements IDoubleQueue<T>
{    
    private ArrayList<T> LQueue;
    private int maxListSize;

    /**ListDoubleQueueConstructorContact
     * initializes an empty queue and assigns maxListSize
     *
     * @param maxSize represents the bounds of queue
     *
     * @pre maxSize > 0
     *
     * @post
     * LQueue is empty
     * maxListSize = maxSize
     *
     */
    public ListDoubleQueue(int maxSize)
    {
        this.LQueue = new ArrayList<T>();
        this.maxListSize = maxSize;
    }

    /**enqueueContact
     * assigns new element at the end of queue with a value
     *
     * @param val represents the value of the next element
     *
     * @pre 0 <= |LQueue| < maxListSize 
     *
     * @post
     * |LQueue| = |LQueue| + 1
     * [LQuueue has gained another element at the end of queue]
     *
     */
    @Override
    public void enqueue(T val)
    {
        LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public T dequeue()
    {
        return LQueue.remove(0);
    }


    @Override
    public int length()
    {
        return LQueue.size();
    }


    public String toString()
    {
        String ret = "";
        for(T d : LQueue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

}
