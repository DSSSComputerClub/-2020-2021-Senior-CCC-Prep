import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        
        // Declaring a method of input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(reader.readLine()); // Getting range
        int m = Integer.parseInt(reader.readLine()); // Getting number of rounds

        int roundsRemoval[] = new int[m]; // Array of rounds

        // Traversing array of rounds
        for (int i = 0; i < roundsRemoval.length; i++) {
            roundsRemoval[i] = Integer.parseInt(reader.readLine()); // Passing in positions we need to remove
        }

        // Declaring a list with the range
        ArrayList<Integer> friends = new ArrayList<Integer>();

        // Populating the list
        for (int i = 0; i < k; i++) {
            friends.add(i+1);
        }

        // Removal
        for (int i = 0; i < m; i++){
            
            // List that holds all of the values we must remove
            ArrayList<Integer> removal = new ArrayList<Integer>();
            
            // Looping through the list
            for (int j = 0; j < friends.size(); j++) {
                // If the current position is a multiple of the position we must remove
                if ((j+1) % roundsRemoval[i] == 0) {
                    removal.add(friends.get(j)); // Add it to the removal list
                }
            }
            friends.removeAll(removal); // Remove all of the elements that are in the friends list that are also in the removal list
        }

        // Outputting the new list
        for (Integer integer : friends) {
            System.out.println(integer);
        }



    }
}