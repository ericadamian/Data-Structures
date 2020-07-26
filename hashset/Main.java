// java program by Eric Adamian
// HashSet data structure implementation using the given interface
// main program to test each method

@SuppressWarnings("unchecked")
public class Main{
	public static void main(String[] args){

		HashSetInterface arrayLP = new HashSetLP();
		HashSetInterface arrayQP = new HashSetQP();

		// *****************************************************************************************************
		// LINEAR PROBING

		System.out.println();
		System.out.println("**********************************************************************");
		System.out.println("\t\tHash Set (linear probing) testing results");
		System.out.println("\t\t\tContains hardcoded values");
		System.out.println("**********************************************************************");
		System.out.println();

		System.out.println("Is the given array empty? " + arrayLP.isEmpty());
		System.out.println("Does this array contain the given entry? " + arrayLP.contains(3));
		System.out.println("Were you able to add the given entry? " + arrayLP.add(13));
		System.out.println("Were you able to add the given entry? " + arrayLP.add(8));
		System.out.println("Were you able to add the given entry? " + arrayLP.add(13));
		System.out.println("Were you able to add the given entry? " + arrayLP.add(20));
		System.out.println("Removing the following entry from our array: " + arrayLP.remove(16));
		System.out.println("Removing the following entry from our array: " + arrayLP.remove(8));
		System.out.println("Does this array contain the given entry? " + arrayLP.contains(20));
		System.out.println("Does this array contain the given entry? " + arrayLP.contains(45));

		System.out.print("Your current array: ");
		for (Object anEntry: arrayLP.toArray()){
			System.out.print((Integer)anEntry + " ");
		}

		System.out.println();
		System.out.println("How many entries are in our array? " + arrayLP.size());
		System.out.println("Is the given array empty? " + arrayLP.isEmpty());

		System.out.println("***Clearing entries in our array***");
		arrayLP.clear();

		System.out.println("Your current array: ");
		for (Object anEntry: arrayLP.toArray()){
			System.out.print((Integer)anEntry + " ");
		}

		System.out.println("How many entries are in our array? " + arrayLP.size());
		System.out.println("Were you able to add the given entry? " + arrayLP.add(8));
		System.out.println("Were you able to add the given entry? " + arrayLP.add(20));
		System.out.println("How many entries are in our array? " + arrayLP.size());
		System.out.println("Removing the following entry from our array: " + arrayLP.remove(20));
		System.out.println("How many entries are in our array? " + arrayLP.size());

		System.out.print("Your current array: ");
		for (Object anEntry: arrayLP.toArray()){
			System.out.print((Integer)anEntry + " ");
		}

		// *****************************************************************************************************
		// QUADRATIC PROBING

		System.out.println();
		System.out.println();
		System.out.println("**********************************************************************");
		System.out.println("\t\tHash Set (quadratic probing) testing results");
		System.out.println("\t\t\tContains hardcoded values");
		System.out.println("**********************************************************************");
		System.out.println();

		System.out.println("Is the given array empty? " + arrayQP.isEmpty());
		System.out.println("Does this array contain the given entry? " + arrayQP.contains(3));
		System.out.println("Were you able to add the given entry? " + arrayQP.add(13));
		System.out.println("Were you able to add the given entry? " + arrayQP.add(8));
		System.out.println("Were you able to add the given entry? " + arrayQP.add(13));
		System.out.println("Were you able to add the given entry? " + arrayQP.add(20));
		System.out.println("Removing the following entry from our array: " + arrayQP.remove(16));
		System.out.println("Removing the following entry from our array: " + arrayQP.remove(8));
		System.out.println("Does this array contain the given entry? " + arrayQP.contains(20));
		System.out.println("Does this array contain the given entry? " + arrayQP.contains(45));

		System.out.print("Your current array: ");
		for (Object anEntry: arrayQP.toArray()){
			System.out.print((Integer)anEntry + " ");
		}

		System.out.println();
		System.out.println("How many entries are in our array? " + arrayQP.size());
		System.out.println("Is the given array empty? " + arrayQP.isEmpty());

		System.out.println("***Clearing entries in our array***");
		arrayQP.clear();

		System.out.println("Your current array: ");
		for (Object anEntry: arrayQP.toArray()){
			System.out.print((Integer)anEntry + " ");
		}

		System.out.println("How many entries are in our array? " + arrayQP.size());
		System.out.println("Were you able to add the given entry? " + arrayQP.add(8));
		System.out.println("Were you able to add the given entry? " + arrayQP.add(20));
		System.out.println("How many entries are in our array? " + arrayQP.size());
		System.out.println("Removing the following entry from our array: " + arrayQP.remove(20));
		System.out.println("How many entries are in our array? " + arrayQP.size());

		System.out.print("Your current array: ");
		for (Object anEntry: arrayQP.toArray()){
			System.out.print((Integer)anEntry + " ");
		}

		System.out.println();
		System.out.println();

	}
}
