// java program by Eric Adamian
// MaxHeap data structure implementation using the given interface
// main program to test each method

@SuppressWarnings("unchecked")
public class MaxHeapInterfaceTest{
    public static void main(String[] args){

        MaxHeapInterface<Integer> heap = new MaxHeap<>(10);

        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("\tMaxHeap testing results (contains hardcoded values)");
        System.out.println("**********************************************************************");
        System.out.println();

        System.out.println("Is the given heap empty? " + heap.isEmpty());

        System.out.println("***Adding the specified entry to our heap***");
        heap.add(12);

        System.out.println("***Adding the specified entry to our heap***");
        heap.add(13);

        System.out.println("***Adding the specified entry to our heap***");
        heap.add(7);

        System.out.println("How many entries are in our heap? " + heap.getSize());

        System.out.println("What is the maximum/largest entry in our heap? " + heap.getMax());

        System.out.println("***Adding the specified entry to our heap***");
        heap.add(5);

        System.out.println("***Adding the specified entry to our heap***");
        heap.add(16);

        System.out.println("***Adding the specified entry to our heap***");
        heap.add(2);

        System.out.println("***Adding the specified entry to our heap***");
        heap.add(11);

        System.out.println("The following entry has been removed: " + heap.removeMax());
        System.out.println("The following entry has been removed: " + heap.removeMax());

        System.out.println("How many entries are in our heap? " + heap.getSize());

        System.out.println("***Adding the specified entry to our heap***");
        heap.add(1);

        System.out.println("***Adding the specified entry to our heap***");
        heap.add(9);

        System.out.println("***Adding the specified entry to our heap***");
        heap.add(22);

        System.out.println("***Adding the specified entry to our heap***");
        heap.add(19);

        System.out.println("***Adding the specified entry to our heap***");
        heap.add(2);

        // adding specified entry (11th entry) exceeds initial capacity
        // will not be accounted for getSize(), getMax(), or any other methods
        System.out.println("***Attempting to add specified entry to our heap (exceeds capacity)***");
        heap.add(45);

        System.out.println("What is the maximum/largest entry in our heap? " + heap.getMax());

        System.out.println("How many entries are in our heap? " + heap.getSize());

        System.out.println("Is the given heap empty? " + heap.isEmpty());

        System.out.println("***Clearing entries in our heap***");
        heap.clear();
        
        System.out.println("Is the given heap empty? " + heap.isEmpty());
    }
}