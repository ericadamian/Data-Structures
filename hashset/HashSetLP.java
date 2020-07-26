// java program by Eric Adamian
// HashSet (linear probing) data structure implementation using the given interface

@SuppressWarnings("unchecked")
public class HashSetLP<T> implements HashSetInterface<T>{
    
    // uses probing for 31 attempts; array size of 157 (maximum capacity)
    private T[] set;
    public int numberOfEntries;
    private final int MAX_CAPACITY = 157;


    // constructor: casting array of type T to new object with bounds of given maximum capacity (157)
    public HashSetLP(){
        set = (T[]) new Object[MAX_CAPACITY];
        numberOfEntries = 0;
    }


    public int size(){
        return numberOfEntries;
    }


    public boolean isEmpty(){
        if(numberOfEntries == 0){
            return true;
        } else {
            return false;
        }
    }


    public boolean contains(T item){
        for(int i = 0; i < 31; i++){

            int result = (item.hashCode() + i) % MAX_CAPACITY;

            if(item.equals(set[result])){
                    return true;
            }
        }
        return false;
    }


    public T[] toArray(){
        int counter = 0;
        T[] array = (T[]) new Object[numberOfEntries];

        for(int i = 0; i < set.length; i++){
            if(set[i] != null){
                array[counter] = set[i];
                counter++;
            }
        }
        return array;
    }


    public boolean add(T item){
        for(int i = 0; i < 31; i++){

            int result = (item.hashCode() + i) % MAX_CAPACITY;

            if(set[result] == null){
                set[result] = item;
                numberOfEntries++;
                return true;
            }

            if(contains(item) || item == set[result]){
                return false;
            }
        }
        return false;
    }


    public T remove(T item){
        for(int i = 0; i < 31; i++){

            int result = (item.hashCode() + i) % MAX_CAPACITY;

            if(item.equals(set[result]) && set[result]!=null){
                set[result] = null;
                numberOfEntries--;
                return item;
            }

        }
        return null;
    }


    public void clear(){
        for (int i = 0; i < set.length; i++){
            set[i] = null;
        }
        numberOfEntries = 0;
    }
}
