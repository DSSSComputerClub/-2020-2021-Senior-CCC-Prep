import java.util.ArrayList;
import java.util.HashSet;

public class CollectionClasses {
    public static void main(String[] args) {

        // Lists

        System.out.println("--------------------------------------------------------------");
        System.out.println("\n\t\t\tArrayLists\n");
        System.out.println("--------------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<Integer>(1); // Instantiating a list object

        list1.add(1); // Adding the value of 1 to the list

        // Loop to output the data in the list
        System.out.println("Outputting data before changes");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i)); // Outputting each index using the get() method
        }

        // Adding 2 more elements to the list
        list1.add(2);
        list1.add(3);

        // Loop to output the data in the list
        System.out.println("Outputting data after adding more elements");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i)); // Outputting each index using the get() method
        }

        // Removing an element from the list
        list1.remove(0);

        // Loop to output the data in the list
        System.out.println("Outputting data after removing an element");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i)); // Outputting each index using the get() method
        }

        // Sets

        System.out.println("--------------------------------------------------------------");
        System.out.println("\n\t\t\tHashSets\n");
        System.out.println("--------------------------------------------------------------");

        HashSet<Integer> set1 = new HashSet<Integer>(1); // Instantiating a set object

        set1.add(1); // Adding the value of 1 to the set

        // Loop to output the data in the set
        System.out.println("Outputting data before changes");
        for (Integer integer : set1) {
            System.out.println(integer);
        }

        // Adding 2 more elements to the set
        set1.add(2);
        set1.add(3);

        // Loop to output the data in the set
        System.out.println("Outputting data after adding more elements");
        for (Integer integer : set1) {
            System.out.println(integer);
        }

        // Removing an element from the set
        set1.remove(2);

        // Loop to output the data in the set
        System.out.println("Outputting data after removing an element");
        for (Integer integer : set1) {
            System.out.println(integer);
        }

        set1.add(5); // What will happen if we do this?
        System.out.println(set1.add(5)); // We can check to see if it will be added or not

        // Loop to output the data in the set
        System.out.println("Outputting data after trying to add an element");
        for (Integer integer : set1) {
            System.out.println(integer);
        }

    }
}
