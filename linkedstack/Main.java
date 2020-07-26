// java program by Eric Adamian
// LinkedStack data structure implementation using the given interface
// main program to test each method

@SuppressWarnings("unchecked")
public class Main{
    public static void main (String[] args) {

        LinkedStack linkedstack = new LinkedStack();

        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("\tLinkedStack testing results (contains hardcoded values)");
        System.out.println("**********************************************************************");
        System.out.println(); 

        // *********************************************************************************************
        // each throws EmptyStackException
        // System.out.println("The following element was added to the stack: " + linkedstack.peek());
        // System.out.println("The following element was popped from the stack: " + linkedstack.pop());
        // *********************************************************************************************
	    
	System.out.println("Is the given stack empty? " + linkedstack.isEmpty());
        
        linkedstack.push(15);
        System.out.println("The following element was added to the stack: " + linkedstack.peek());

        linkedstack.push(6);
        System.out.println("The following element was added to the stack: " + linkedstack.peek());

        System.out.println("Is the given stack empty? " + linkedstack.isEmpty());

        System.out.println("***Clearing elements in our stack***");
        linkedstack.clear();

        linkedstack.push(8);
        System.out.println("The following element was added to the stack: " + linkedstack.peek());

        linkedstack.push(11);
        System.out.println("The following element was added to the stack: " + linkedstack.peek());

        linkedstack.push(4);
        System.out.println("The following element was added to the stack: " + linkedstack.peek());


		System.out.println("The following element was popped from the stack: " + linkedstack.pop());

		while (!linkedstack.isEmpty()){
        	System.out.println("The top element on the stack is: " + linkedstack.peek());
        	System.out.println("The following element was popped from the stack: " + linkedstack.pop());
        	System.out.println("Is the given stack empty? " + linkedstack.isEmpty());
      	}
    }
}        
