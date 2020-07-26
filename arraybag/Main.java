// java program by Eric Adamian
// ArrayBag data structure implementation using the given interface
// main program to test each method

@SuppressWarnings("unchecked")
public class Main{
    public static void main(String[] args){

        BagInterface<Integer> bag = new ArrayBag<>();

        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("\tArrayBag testing results (contains hardcoded values)");
        System.out.println("**********************************************************************");
        System.out.println();

        System.out.println("Is the given bag empty? " + bag.isEmpty());
        System.out.println("Does this bag contain the given entry? " + bag.contains(9));
        System.out.println("Were you able to add the given entry? " + bag.add(4));
        System.out.println("Were you able to add the given entry? " + bag.add(2));
        System.out.println("Were you able to add the given entry? " + bag.add(13));
        System.out.println("Were you able to add the given entry? " + bag.add(15));
        System.out.println("Were you able to add the given entry? " + bag.add(7));

        System.out.print("Your current array: ");
        Object[] objs = bag.toArray();
        for (Object o: objs){
            System.out.print(((Integer) o).toString() + " ");
        }

        System.out.println();
        System.out.println("Were you able to remove the specified entry? " + bag.remove(3));
        System.out.println("The following entry has been removed from the bag: " + bag.remove());
        System.out.println("Were you able to remove the specified entry? " + bag.remove(2));

        System.out.println("How many entries are in our bag? " + bag.getCurrentSize());
        System.out.println("Does this bag contain the given entry? " + bag.contains(12));
        System.out.println("Does this bag contain the given entry? " + bag.contains(13));

        System.out.println("***Clearing entries in our arraybag***");
        bag.clear();

        System.out.println("Is the given bag empty? " + bag.isEmpty());
        System.out.println("Were you able to add the given entry? " + bag.add(8));
        System.out.println("Were you able to add the given entry? " + bag.add(8));
        System.out.println("How many entries are in our bag? " + bag.getCurrentSize());
        System.out.println("Were you able to add the given entry? " + bag.add(8));

        System.out.print("Your current array: ");
        Object[] objs2 = bag.toArray();
        for (Object o: objs2){
            System.out.print(((Integer) o).toString() + " ");
        }

        System.out.println();
        System.out.println("How many times did the given entry occur? " + bag.getFrequencyOf(8));
        System.out.println("The following entry has been removed from the bag: " + bag.remove());
        System.out.println("How many times did the given entry occur? " + bag.getFrequencyOf(8));
        System.out.println("Is the given bag empty? " + bag.isEmpty());

        System.out.println("***Clearing entries in our arraybag***");
        bag.clear();

        System.out.println("Is the given bag empty? " + bag.isEmpty());
    }
}
