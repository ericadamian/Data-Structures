// java program by Eric Adamian
// ArrayStack data structure implementation using the given interface

import java.util.EmptyStackException;

@SuppressWarnings("unchecked")
public class ArrayStack<T> implements StackInterface<T> {

    private T[] stack;
    private int topElement;
    private static final int MAXIMUM_CAPACITY = 25;

    // top element = -1 for index
    public ArrayStack(int initialCapacity) {
        stack = (T[]) new Object[initialCapacity];
        topElement = -1;
    }

    // creates a stack using the maximum capacity (of size 25)
    public ArrayStack(){
        this(MAXIMUM_CAPACITY);
    }

    // when maximum capacity exceeded with original stack, new stack is created for entries
    // avoids ArrayIndexOutOfBoundsException
    public void push(T newEntry){
        if(topElement + 1 == stack.length){
            T[] newStack = (T[]) new Object[stack.length + 25];
                
            for(int i = 0; i < stack.length; i++){
                newStack[i] = stack[i];
            }
            stack = newStack;
        }        
        stack[++topElement] = newEntry;
    }

    public T pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }

        T popElement = stack[topElement];
        stack[topElement] = null;
        topElement--;
        return popElement;
    }

    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack[topElement];
    }

    public boolean isEmpty(){
        return topElement == -1;
    }

    public void clear(){
        while (!isEmpty())
            pop();
    }
}
