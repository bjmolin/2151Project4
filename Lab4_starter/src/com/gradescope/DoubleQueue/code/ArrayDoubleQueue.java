package com.gradescope.DoubleQueue.code;

/**ArrayDoubleQueueContract
 * Array implementation for the generic T queue.
 *
 * @invariant: queueMaxSize > 0
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue<T> implements IDoubleQueue<T>
{
    private T[] queue;
    private int queueMaxSize;

    /**ArrayDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue.
     *
     * @param maxSize max size of the array
     *
     * @pre maxSize > 0
     *
     * @post queueMaxSize = maxSize AND self = new T[queueMaxSize].
     *
     */
    public ArrayDoubleQueue(int maxSize)
    {
        queueMaxSize = maxSize;
        queue = (T[]) new Object[queueMaxSize];
    }

    /**enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the generic T to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(T val)
    {
        for (int i = 0; i < queueMaxSize; i++) {
            if (queue[i] == null) {
                queue[i] = val;
                break;
            } 
        }
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public T dequeue()
    {
        T val = queue[0];
        for (int i = 0; i < (queueMaxSize - 1); i++) {
            queue[i] = queue[i+1];
        }
        return val;
    }

    @Override
    public int length()
    {
        int count = 0;
        for(int i = 0; i < queue.length; i++){ 
            if (queue[i] != null){
                count++;
            }
        }
        return count;
    }

    public String toString()
    {

        String ret = "";
        
        for (int i = 0; i < queueMaxSize; i++) {
            ret += "[";
            if (queue[i] == null) ret += "null";
            else ret += queue[i];
            ret += "] ";
        }

        return ret;
    }

    //-----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize()
    {
        return this.queueMaxSize;
    }

    public T[] getQueue()
    {
        return this.queue;
    }
}
