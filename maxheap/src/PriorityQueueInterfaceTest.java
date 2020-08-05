// java program by Eric Adamian
// HeapPriorityQueue data structure implementation using the given interface
// main program to test each method

public class PriorityQueueInterfaceTest{

    public static void main(String[] args){

        PriorityQueueInterface<Integer> pq = new HeapPriorityQueue<>();

        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("\tPriority Queue testing results (contains hardcoded values)");
        System.out.println("**********************************************************************");
        System.out.println();

        System.out.println("Is the given queue empty? " + pq.isEmpty());

        System.out.println("***Adding the specified entry to our queue***");
        pq.add(12);

        System.out.println("***Adding the specified entry to our queue***");
        pq.add(13);

        System.out.println("***Adding the specified entry to our queue***");
        pq.add(7);

        System.out.println("How many entries are in our queue? " + pq.getSize());

        System.out.println("What is the maximum/largest entry in our queue? " + pq.peek());

        System.out.println("***Adding the specified entry to our queue***");
        pq.add(5);

        System.out.println("***Adding the specified entry to our queue***");
        pq.add(16);

        System.out.println("***Adding the specified entry to our queue***");
        pq.add(2);

        System.out.println("***Adding the specified entry to our queue***");
        pq.add(11);

        System.out.println("The following entry has been removed: " + pq.remove());
        System.out.println("The following entry has been removed: " + pq.remove());

        System.out.println("How many entries are in our queue? " + pq.getSize());

        System.out.println("***Adding the specified entry to our queue***");
        pq.add(1);

        System.out.println("***Adding the specified entry to our queue***");
        pq.add(9);

        System.out.println("***Adding the specified entry to our queue***");
        pq.add(22);

        System.out.println("***Adding the specified entry to our queue***");
        pq.add(19);

        System.out.println("***Adding the specified entry to our queue***");
        pq.add(2);

        // adding specified entry (11th entry) exceeds initial capacity
        // will not be accounted for getSize(), peek(), or any other methods
        System.out.println("***Attempting to add specified entry to our queue (exceeds capacity)***");
        pq.add(45);

        System.out.println("What is the maximum/largest entry in our queue? " + pq.peek());

        System.out.println("How many entries are in our queue? " + pq.getSize());

        System.out.println("Is the given queue empty? " + pq.isEmpty());

        System.out.println("***Clearing entries in our queue***");
        pq.clear();
        
        System.out.println("Is the given queue empty? " + pq.isEmpty());
    }
}