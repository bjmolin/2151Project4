package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures:
 * queue is empty and 
 * is of max_queue_size or lower
 *
 *@defines:
 * max_queue_size = x;
 *
 *@constraints:
 * 0 <= |self| <= max_queue_size
 *  
 */
public interface IDoubleQueue <T>
{


    //This function's contracts are in the individual classes
    public void enqueue(T val);

    /**dequeueContract
     * return value in front of queue and moves to next value
     *
     *@return a Double that represents first in self
     *
     *@pre
     * |self| > 0
     *
     *@post
     * self = dequeue() o self
     * |self| = |self| - 1
     * [return first element]
     *
     */
    public T dequeue();

    /**lengthContract
     *  gets and returns size of self
     *
     *@return an int representing size of self
     *
     *@pre 
     * |self| >= 0;
     *
     *@post
     * self = #self
     * return |self|;
     * |self| = #|self|
     *
     */
    public int length();


    /** peek Contract
     *  returns ffront of queue
     *
     *@return an T representing front of queue
     *
     *@pre 
     * |self| > 0;
     *
     *@post
     * self = #self
     * return [first element in queue]
     * |self| = #|self|
     *
     */
    public T peek();


    /**toStringContract
     * converts self to string
     *
     *@return a string represeting self
     *
     *@pre |self| > 0
     *
     *@post
     * self = #self
     * |self| = #|self|
     * return self as string
     *
     */
    public String toString();

    /**peek
     * default function that can returns the left-most position
     *
     *@return a generic type
     *
     *@pre |self| > 0
     *
     *@post
     * self = #self
     * |self| = #|self|
     * 
     *
     */
    public T peek();
}
