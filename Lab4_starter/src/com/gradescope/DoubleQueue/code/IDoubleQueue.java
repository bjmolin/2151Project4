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
public interface IDoubleQueue
{


    //This function's contracts are in the individual classes
    public void enqueue(Double val);

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
    public Double dequeue();

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
}
