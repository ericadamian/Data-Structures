// java program by Eric Adamian
// ArrayStack data structure implementation using the given interface
// main program to test each method

@SuppressWarnings("unchecked")
public class Main{
    public static void main (String[] args) {

        ArrayStack arraystack = new ArrayStack();

        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("\tArrayStack testing results (contains hardcoded values)");
        System.out.println("**********************************************************************");
        System.out.println(); 

        // *********************************************************************************************
        // each throws EmptyStackException
        // System.out.println("The following element was added to the stack: " + linkedstack.peek());
        // System.out.println("The following element was popped from the stack: " + linkedstack.pop());
        // *********************************************************************************************


        System.out.println("Is the given stack empty? " + arraystack.isEmpty());


        arraystack.push(3);
        System.out.println("The following element was added to the stack: " + arraystack.peek());

        arraystack.push(8);
        System.out.println("The following element was added to the stack: " + arraystack.peek());

        System.out.println("Is the given stack empty? " + arraystack.isEmpty());

        System.out.println("***Clearing elements in our stack***");
        arraystack.clear();

        System.out.println("Is the given stack empty? " + arraystack.isEmpty());

        arraystack.push(16);
        System.out.println("The following element was added to the stack: " + arraystack.peek());

        arraystack.push(5);
        System.out.println("The following element was added to the stack: " + arraystack.peek());

        arraystack.push(11);
        System.out.println("The following element was added to the stack: " + arraystack.peek());


		System.out.println("The following element was popped from the stack: " + arraystack.pop());

		while (!arraystack.isEmpty()){
        	System.out.println("The top element on the stack is: " + arraystack.peek());
        	System.out.println("The following element was popped from the stack: " + arraystack.pop());
        	System.out.println("Is the given stack empty? " + arraystack.isEmpty());
      	}

        // *********************************************************************************************
        // pushing greater than 25 elements onto the stack generates new stack
        // avoids ArrayIndexOutOfBoundsException

        System.out.println("***Exceeding stack capacity, generating new stack***");

        arraystack.push(47);
        arraystack.push(16);
        arraystack.push(67);
        arraystack.push(8);
        arraystack.push(16);
        arraystack.push(12);
        arraystack.push(15);
        arraystack.push(63);
        arraystack.push(32);
        arraystack.push(81);
        arraystack.push(13);
        arraystack.push(2);
        arraystack.push(14);
        arraystack.push(55);
        arraystack.push(74);
        arraystack.push(5);
        arraystack.push(6);
        arraystack.push(10);
        arraystack.push(43);
        arraystack.push(61);
        arraystack.push(78);
        arraystack.push(64);
        arraystack.push(87);
        arraystack.push(51);
        arraystack.push(90);
        arraystack.push(23);
        arraystack.push(45);
        arraystack.push(58);
        arraystack.push(30);
        arraystack.push(49);
        arraystack.push(12);

        System.out.println("The following element was added to our new stack: " + arraystack.peek());

        // *********************************************************************************************
    }
} 
