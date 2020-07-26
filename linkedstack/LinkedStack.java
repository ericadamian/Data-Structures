// java program by Eric Adamian
// LinkedStack data structure implementation using the given interface

import java.util.EmptyStackException;

@SuppressWarnings("unchecked")
public class LinkedStack<T> implements StackInterface<T>{

    private Node head;

    public LinkedStack(){
        head = null;
    }

    public void push(T newEntry){
        Node newNode = new Node(newEntry, head);
        head = newNode;
    }

    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp.item;
    }
    
    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return head.item;
    }
    
    public boolean isEmpty(){
        return head == null;
    }

    public void clear(){
        while(!isEmpty())
            pop();
    }
    

    // Node class
    private class Node{
        private T item;
        private Node next;

        private Node(T item){
            this(item, null);
        }

        private Node(T item, Node next){
            this.item = item;
            this.next = next;
        }
    }

}
