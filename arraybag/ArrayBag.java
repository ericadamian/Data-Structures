// java program by Eric Adamian
// ArrayBag data structure implementation using the given interface

@SuppressWarnings("unchecked")
public class ArrayBag<T> implements BagInterface<T>{
	private final T[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 10000;


    public ArrayBag(){
        this(DEFAULT_CAPACITY);
    }


    public ArrayBag(int desiredCapacity){
        if (desiredCapacity > MAX_CAPACITY) {
            throw new IllegalStateException("Attempt to create a bag " +
                    "whose capacity exceeds " +
                    "allowed maximum.");
        }

        // the cast is safe because the new array contains null entries
        bag = (T[]) new Object[desiredCapacity]; // unchecked cast
        numberOfEntries = 0;
    }


    public int getCurrentSize(){
        return numberOfEntries;
    }


    public boolean isEmpty(){
        return (numberOfEntries == 0);
    }


    public boolean add(T newEntry){
    	try{
    		bag[numberOfEntries] = newEntry;
    		numberOfEntries++;
    	} catch (Exception e){
    		return false;
    	}
    	
    	return true;
    }


    public T remove(){
    	return removeAt(numberOfEntries - 1);
    }	
    	

    public boolean remove(T anEntry){
    	for (int i = 0; i < numberOfEntries; i++)
    		if(anEntry.equals(bag[i])){
    				removeAt(i);
    				if(numberOfEntries > 0){
    					bag[i] = bag[numberOfEntries + 1];
    					bag[numberOfEntries + 1] = null;
    			} 
    	
    			return true;
    		}	

        return false;
	}
    
    private T removeAt(int index){
    	T tempElement = null;
    	try{
    		tempElement = bag[index];
    		bag[index] = null;
    		--numberOfEntries;
    	} catch (Exception e){ }
    	
    	return tempElement;
    }


    public void clear(){
    	while (!isEmpty())
    		remove();
    }


    public int getFrequencyOf(T anEntry){
    	
    	int counter = 0;
    	for(int i = 0; i < numberOfEntries; i++) 
    		if(anEntry.equals(bag[i])){
    			++counter;
    		}
    		return counter;
    }


    public boolean contains(T anEntry){
    	for(int i = 0; i < numberOfEntries; i++) 
    		if(anEntry.equals(bag[i])) {
    			return true;
    		}
    		return false;
    }
    

    public T[] toArray(){
    	
    	@SuppressWarnings("unchecked")
		T[] temp = (T[]) new Object[numberOfEntries];
    	for(int i = 0; i < numberOfEntries; i++){
    		temp[i] = bag[i];
    	}	
    	return temp;	
    }
}
