// java program by Eric Adamian
// LinkedDeque data structure implementation using the given interface
// main program to test each method

@SuppressWarnings("unchecked")
public class Main {

	public static void main(String[] args) {

		LinkedDeque deque = new LinkedDeque();

		System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("\tDeque testing results (contains hardcoded values)");
        System.out.println("**********************************************************************");
        System.out.println();

        System.out.println("Is the given deque empty? " + deque.isEmpty());

		System.out.println("***Adding the specified entry to the front of our deque***");
		deque.addToFront(4);

		System.out.println("***Adding the specified entry to the back of our deque***");
		deque.addToBack(8);

		System.out.println("***Adding the specified entry to the front of our deque***");
		deque.addToFront(19);

		System.out.println("***Adding the specified entry to the back of our deque***");
		deque.addToFront(2);

		System.out.println("***Adding the specified entry to the front of our deque***");
		deque.addToFront(7);

		System.out.println("***Adding the specified entry to the front of our deque***");
		deque.addToBack(5);

		System.out.println("***Adding the specified entry to the front of our deque***");
		deque.addToFront(12);


		System.out.println("Is the given deque empty? " + deque.isEmpty());

		System.out.println("Our current deque: " + deque);

		System.out.println("The first entry in our deque: " + deque.getFront());

		System.out.println("The last entry in our deque: " + deque.getBack());


		System.out.println("***Removing an entry from the front of our deque***");
		deque.removeFront();

		System.out.println("***Removing an entry from the front of our deque***");
		deque.removeFront();

		System.out.println("***Removing an entry from the back of our deque***");
		deque.removeBack();


		System.out.println("Our current deque: " + deque);

		System.out.println("The first entry in our deque: " + deque.getFront());

		System.out.println("The last entry in our deque: " + deque.getBack());


		System.out.println("***Adding the specified entry to the back of our deque***");
		deque.addToBack(15);

		System.out.println("***Adding the specified entry to the back of our deque***");
		deque.addToBack(7);


		System.out.println("Our current deque: " + deque);

		System.out.println("***Clearing entries in deque***");
        deque.clear();

        System.out.println("Is the given deque empty? " + deque.isEmpty());

        System.out.println("Our current deque: " + deque);
	}
}