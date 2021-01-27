import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        // Instantiating reader + inputstreamreader to get input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine()); // Converting first number to int
        List<Integer> swiftsScore = getTokens(reader.readLine()); // Getting line2 scores
        List<Integer> semaScore = getTokens(reader.readLine()); // Getting line3 scores

        int day = 0; // Represents the day they have the same score
        int swiftDayScore = 0; // Represents swift's score with a particular combination of days
        int semaDayScore = 0; // Represents sema's score with a particular combination of days

        // Loop to iterate through each array
        for (int i = 0; i < number; i++) {
            swiftDayScore += swiftsScore.get(i); // Adding up the scores from each day
            semaDayScore += semaScore.get(i); // Adding up the scores from each day
            // Compare if they are the same
            if (swiftDayScore == semaDayScore) {
                day = i + 1; // Save the day
            }

        }
        System.out.println(day); // Output result

    }

    /**
     * Splitting string based off " " into tokens
     * 
     * @param str
     * @return integer list
     */
    private static List<Integer> getTokens(String str) {
        List<Integer> list = new ArrayList<Integer>();
        String array[] = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            list.add(Integer.parseInt(array[i]));
        }
        return list;
    }

}