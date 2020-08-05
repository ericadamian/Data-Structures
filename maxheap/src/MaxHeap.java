// java program by Eric Adamian
// MaxHeap data structure implementation using the given interface

@SuppressWarnings("unchecked")
public class MaxHeap<T extends Comparable<? super T>>
        implements MaxHeapInterface<T>{

    private T[] array;
    private int numberOfEntries;
    private static final int DEFAULT_INITIAL_CAPACITY = 10;

    // create a heap array with initial capacity 10
    public MaxHeap(){
        this(DEFAULT_INITIAL_CAPACITY);
    }

    // create a heap array with the given initial capacity
    public MaxHeap(int initialCapacity){
        array = (T[]) new Comparable[initialCapacity + 1];
        numberOfEntries = 0;
    }

    // to swap elements in max heap
    private void swap(int index1, int index2){
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // to adjust the heap in the case of an addition
    private void maxUpHeap(T[] array, int index){

        while(index > 1 && array[index / 2].compareTo(array[index]) < 0){
            swap(index / 2 , index);
            index = index / 2;
        }
    }

    // to adjust the heap in the case of a removal
    private void maxHeapify(T[] array, int index){

        if(index > (numberOfEntries / 2)){
            return;
        }

        int largest = index;
        int leftChild = 2 * index;
        int rightChild = (2 * index) + 1;

        if(leftChild <= numberOfEntries && array[leftChild].compareTo(array[largest]) > 0){
            largest = leftChild;
        }

        if(rightChild <= numberOfEntries && array[rightChild].compareTo(array[largest]) > 0){
            largest = rightChild;
        }

        if(largest != index){
            swap(index, largest);
            maxHeapify(array, largest);
        }
    }

    public void add(T newEntry){

        if((array.length - 1) == numberOfEntries){
            return;
        }

        array[numberOfEntries + 1] = newEntry;
        numberOfEntries++;

        maxUpHeap(array,numberOfEntries);
    }

    public T removeMax(){

        T maxHeap = array[1];
        swap(1, numberOfEntries);
        array[numberOfEntries] = null;
        numberOfEntries--;
        maxHeapify(array, 1);
        return maxHeap;
    }

    public T getMax(){

        if(numberOfEntries == 0){
            return null;
        }else{
            return array[1];
        }
    }

    public boolean isEmpty(){
        return numberOfEntries == 0;
    }

    public int getSize(){
        return numberOfEntries;
    }

    public void clear(){

        if(numberOfEntries == 0){
            return;
        }

        while(!isEmpty()){
            removeMax();
        }
    }
}