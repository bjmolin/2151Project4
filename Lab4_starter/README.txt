--------------------------------------

Assignment: Lab 4 - Interfaces
Author: Matthew Re
For: Clemson CPSC2150
Updated: Fall_23

--------------------------------------

This starter code was written using IntelliJ and Java JDK version 17.

Using any other IDE and/or JDK version could produce unintended results.

--------------------------------------

TODO:
    Write the specifications for the IDoubleQueue.java file
        Note: Enqueue intentionally does not have a contract in the interface. The implementation between the two
        backends is different enough that it warrants separate contracts for both.
    Implement the functions in ArrayDoubleQueue.java based on the provided contracts
    Complete any contracts within ListDoubleQueue.java based on the implementation

--------------------------------------

Tips:
    Double =/= double (technically)

    Do not forget to state when the state of my object does not change.

    Most postconditions in this lab should be written informally unless you're a lot braver than I am.

    Even though ArrayLists are resizable, make sure the implementation isn't doing anything to stop that. If it is,
	make sure you account for this in your contract.

    The DoubleQueueDriver can be used to test your implementations. It does work when functions are implemented correctly

--------------------------------------

Submission:
    Put a block comment at the top of ArrayDoubleQueue.java, IDoubleQueue.java, and ListDoubleQueue.java with all team
    members names in it.

    You should submit the 3 individual java files listed above. Don't put them in a zip folder or anything. Just drag
    the files into gradescope's submission field. Do anything else and the autograder won't know where to find your
    submission which means 0 points for the half of the lab that is autogradable.

    The autograder should tell you if your implementation of ArrayDoubleQueue's functions are done correctly.
	Gradescope allows for multiple submissions. If a test fails, fix the problem and resubmit.