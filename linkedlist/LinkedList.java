// java program by Eric Adamian
// LinkedList data structure implementation using the given interface

public class LinkedList<T> implements ListInterface<T>{

    private Node head;
    private Node tail;
    private int numberOfEntries;

    public LinkedList(){
        head = new Node(null);
        tail = new Node(null);
        numberOfEntries = 0;
    }

    public void add(T newEntry){

        Node temp = new Node(newEntry);

        if(isEmpty()) {
            head.next = temp;
            temp.next = tail;
        }else{
            temp.next = head.next;
            head.next = temp;
        }

        numberOfEntries++;
    }

    public void add(int newPosition, T newEntry){

        if(newPosition < 1 || newPosition > getLength() + 1){
            throw new IndexOutOfBoundsException("Error: Entry's index not found.");
        }

        Node temp = new Node(newEntry);
     
        if (newPosition == 1){
            temp.next = head;
            head = temp;
        }else{
            Node previous = head;

            for(int counter = 0; counter < newPosition - 1; counter++){
                previous = previous.next;
            }

            temp.next = previous.next;
            previous.next = temp;
        }
     
        numberOfEntries++; 
    }

    public T remove(int givenPosition){

        if(givenPosition < 1 || givenPosition > getLength()){
            throw new IndexOutOfBoundsException("Error: Entry's index not found.");
        }

        Node temp = head;

        for(int counter = 0; counter < givenPosition - 1; counter++){
            temp = temp.next;
        }

        Node temp2 = temp.next;
        temp.next = temp2.next;

        numberOfEntries--;
        return temp2.item;
    }

    public void clear(){
        while(!isEmpty()){
            remove(1);
        }
    }

    public T replace(int givenPosition, T newEntry){

        if(givenPosition < 1 || givenPosition > getLength()){
            throw new IndexOutOfBoundsException("Error: Entry's index not found.");
        }

        Node temp = head;

        for(int counter = -1; counter < givenPosition - 1; counter++){
            temp = temp.next;
        }

        T item = temp.item;
        temp.item = newEntry;

        return item;
    }

    public T getEntry(int givenPosition){

        if(givenPosition < 1 || givenPosition > getLength()){
            throw new IndexOutOfBoundsException("Error: Entry's index not found.");
        }

        Node temp = head.next;

        for(int counter = 0; counter < givenPosition - 1; counter++){
            temp = temp.next;
        }
        
        return temp.item;
    }

    public boolean contains(T anEntry){

        Node temp = head;

        while (temp != null){
            if (anEntry.equals(temp.item)){
                return true;
            }else{
                temp = temp.next;
            }
        } 
        return false;
    }

    public int getLength(){
        return numberOfEntries;
    }

    public boolean isEmpty(){
        return numberOfEntries == 0;
    }

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