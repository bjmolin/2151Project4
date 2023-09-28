package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures:
 *
 *@defines:
 *
 *@constraints:
 *
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     *
     *
     *@return
     *
     *@pre
     *
     *@post
     *
     */
    public Double dequeue();

    /**lengthContract
     *
     *
     *@return
     *
     *@pre
     *
     *@post
     *
     */
    public int length();

    /**toStringContract
     *
     *
     *@return
     *
     *@pre
     *
     *@post
     *
     */
    public String toString();
}
