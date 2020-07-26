// java program by Eric Adamian
// LinkedBag data structure implementation using the given interface

@SuppressWarnings("unchecked")
public class LinkedBag<T> implements BagInterface<T>{
    
    private Node head;
    private int numberOfEntries;
    private static final int MAX_CAPACITY = 10000;


    public LinkedBag(){
        head = null;
        numberOfEntries = 0;
    }


    public int getCurrentSize(){
        return numberOfEntries;
    }


    public boolean isEmpty(){
        return (head == null);
    }


    public boolean add(T newEntry){
        try{
            if (numberOfEntries < MAX_CAPACITY) {
                head = new Node(newEntry, head);
                ++numberOfEntries;
                return true;
            }
        }catch(Exception e){
            return false;
        }
        
        return false;
    }


    public T remove(){
        T result = null;
        if (head != null){
            result = head.item;
            head = head.next;
            numberOfEntries--;
        }
        return result;
    }


    public boolean remove(T anEntry){
        Node temp = head;

        if (head != null){
            for (int i = 0; i < getCurrentSize(); i++){
                if (temp.item == anEntry){
                    temp.item = head.item;
                    head = head.next;
                    numberOfEntries--;
                    return true;
                }else{
                    temp = temp.next;
                }
            }
        }
        return false;
    }


    public void clear(){
        while (!isEmpty())
            remove();
    }


    public int getFrequencyOf(T anEntry){
        int frequency = 0;
        Node temp = head;
        
        while (temp != null){
            if (anEntry.equals(temp.item)){
                frequency++;
            }
            temp = temp.next;
        }
        return frequency;
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


    public T[] toArray(){

        T[] array = (T[]) new Object[numberOfEntries];
        int nodeIndex = 0;
        Node temp = head;

        while(temp != null){
            array[nodeIndex++] = temp.item;
            temp = temp.next;
        }
        return array;
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
