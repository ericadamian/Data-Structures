// java program by Eric Adamian
// LinkedList data structure implementation using the given interface
// main program to test each method

@SuppressWarnings("unchecked")
public class Main{
    public static void main (String[] args) {

        ListInterface list = new LinkedList();

        // Reference
        // List1: [6, 15, 12] (add)
        // List2: [6, 15, 12] --> [6, 18, 15, 12, 9] (add at position)
        // List3: [6, 18, 15, 12, 9] --> [6, 18, 1, 12, 17] (replace at position)
        // List4: [6, 18, 1, 12, 17] --> [6, 17] (remove at position)

        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("\tLinkedList testing results (contains hardcoded values)");
        System.out.println("**********************************************************************");
        System.out.println();

        System.out.println("Is the given list empty? " + list.isEmpty());

        System.out.println("***Adding the specified entry to our list***");
        list.add(12);

        System.out.println("***Adding the specified entry to our list***");
        list.add(15);

        System.out.println("***Adding the specified entry to our list***");
        list.add(6);

        System.out.println("***Adding the specified entry at a specific position in our list***");
        list.add(2, 18);

        System.out.println("***Adding the specified entry at a specific position in our list***");
        list.add(5, 9);

        System.out.println("Does this list contain the specified entry? " + list.contains(9));
        System.out.println("Does this list contain the specified entry? " + list.contains(4));
        System.out.println("Does this list contain the specified entry? " + list.contains(7));
    
        System.out.println("What is the value at the specified index? " + list.getEntry(1));
        System.out.println("What is the value at the specified index? " + list.getEntry(2));
        System.out.println("What is the value at the specified index? " + list.getEntry(3));
        System.out.println("What is the value at the specified index? " + list.getEntry(4));
        System.out.println("What is the value at the specified index? " + list.getEntry(5));

        System.out.println("How many entries are in our list? " + list.getLength());

        System.out.println("The following entry was replaced in the list: " + list.replace(3, 1));
        System.out.println("The following entry was replaced in the list: " + list.replace(5, 17));

        System.out.println("What is the value at the specified index? " + list.getEntry(1));
        System.out.println("What is the value at the specified index? " + list.getEntry(2));
        System.out.println("What is the value at the specified index? " + list.getEntry(3));
        System.out.println("What is the value at the specified index? " + list.getEntry(4));
        System.out.println("What is the value at the specified index? " + list.getEntry(5));

        System.out.println("The following entry was removed from the list: " + list.remove(3));
        System.out.println("The following entry was removed from the list: " + list.remove(2));
        System.out.println("The following entry was removed from the list: " + list.remove(2));

        System.out.println("What is the value at the specified index? " + list.getEntry(1));
        System.out.println("What is the value at the specified index? " + list.getEntry(2));

        System.out.println("How many entries are in our list? " + list.getLength());

        System.out.println("Is the given list empty? " + list.isEmpty());

        System.out.println("Does this list contain the specified entry? " + list.contains(6));
        System.out.println("Does this list contain the specified entry? " + list.contains(1));
        System.out.println("Does this list contain the specified entry? " + list.contains(17));

        System.out.println("***Clearing entries in linked list***");
        list.clear();

        System.out.println("How many entries are in our list? " + list.getLength());

        System.out.println("Is the given list empty? " + list.isEmpty());
    }
}