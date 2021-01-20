/*
* Last Modified: January 11, 2021
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains static sorting methods
*
* Method List:
* 1. public static int[] bubbleSortAscending(int[] a) = This method sorts an array in Ascending order using BubbleSort
* 2. public static int[] bubbleSortDecending(int[] a) = This method sorts an array in Decending order using BubbleSort
* 3. public static int[] selectionSortAscending(int[] a) = This method sorts an array in Ascending order using SelectionSort
* 4. public static int[] selectionSortDecending(int[] a) = This method sorts an array in Decending order using SelectionSort
* 5. public static int[] insertionSortAscending(int[] a) = This method sorts an array in Ascending order using InsertionSort
* 6. public static int[] insertionSortDecending(int[] a) = This method sorts an array in Decending order using InsertionSort
*
* Helper Methods List:
* 1. private static String testAscending(int[] a) = This method tests the Ascending Algorithms
* 2. private static String testDecending(int[] a) = This method tests the Decending Algorithms
*
*
* Main Method can be found at the bottom of the file to test the Algorithms
*
*/
public class SortingMethods {

    /**
     * This method sorts an array in Ascending order using BubbleSort
     * 
     * @param a
     * @return the sorted array
     *
     */
    public static int[] bubbleSortAscending(int[] a) {

        int arrayLength = a.length - 1; // Placeholder value for the array's length - 1
        boolean continueLoop; // Flag

        // Loop to continue while the array is unsorted
        do {
            continueLoop = false; // Setting the Flag to false

            // Loop to traverse the array
            for (int j = 0; j < arrayLength; j++) {
                // If the current index is smaller than the adjacent index the following will
                // occur
                if (a[j] > a[j + 1]) {
                    int temp = a[j]; // Creating a temp variable
                    // Swapping the current index with its adjacent index
                    a[j] = a[j + 1];
                    a[j + 1] = temp; // Making the adjacent index equal to the temp variable
                    continueLoop = true; // Setting the Flag to true
                }
            } // for loop

            arrayLength--; // Subtracting 1 from the loop counter to narrow in on the array

        } while (continueLoop); // While the Flag is true we keep traversing the array

        return a; // Returing the sorted array

    } // bubbleSortAscending Method

    /**
     * This method sorts an array in Decending order using BubbleSort
     * 
     * @param a
     * @return the sorted array
     *
     */
    public static int[] bubbleSortDecending(int[] a) {

        int arrayLength = a.length - 1; // Placeholder value for the array's length - 1
        boolean continueLoop; // Flag

        // Loop to continue while the array is unsorted
        do {
            continueLoop = false; // Setting the Flag to false

            // Loop to traverse the array
            for (int j = 0; j < arrayLength; j++) {
                // If the current index is smaller than the adjacent index the following will
                // occur
                if (a[j] < a[j + 1]) {
                    int temp = a[j]; // Creating a temp variable
                    // Swapping the current index with its adjacent index
                    a[j] = a[j + 1];
                    a[j + 1] = temp; // Making the adjacent index equal to the temp variable
                    continueLoop = true; // Setting the Flag to true
                }
            } // for loop

            arrayLength--; // Subtracting 1 from the loop counter to narrow in on the array

        } while (continueLoop); // While the Flag is true we keep traversing the array

        return a; // Returing the sorted array

    } // bubbleSortDecending Method

    /**
     * This method sorts an array in Ascending order using SelectionSort
     * 
     * @param a
     * @return the sorted array
     * 
     */
    public static int[] selectionSortAscending(int[] a) {

        // Declaring Placeholders
        int min;
        int minIndex;

        // Loop to traverse the entire array
        for (int i = 0; i < (a.length); i++) {

            min = a[i]; // Placeholder for the current index vaue
            minIndex = i; // Placeholder for the current index

            // Loop to traverse the enire array
            for (int j = i + 1; j < a.length; j++) {
                // If the current index value (j) is less than the previous index (i) the
                // following will occur
                if (a[j] < min) {
                    min = a[j]; // Reassigning the min index value
                    minIndex = j; // Reassigning the min index
                }
            } // for loop
            a[minIndex] = a[i]; // Swapping the min index and the current index value
            a[i] = min; // Swapping the current index value to the min index value

        } // for loop

        return a; // Returing the sorted array

    } // selectionSortAscending Method

    /**
     * This method sorts an array in Decending order using SelectionSort
     * 
     * @param a
     * @return the sorted array
     * 
     */
    public static int[] selectionSortDecending(int[] a) {

        // Declaring Placeholders
        int min;
        int minIndex;

        // Loop to traverse the entire array
        for (int i = 0; i < (a.length); i++) {

            min = a[i]; // Placeholder for the current index vaue
            minIndex = i; // Placeholder for the current index

            // Loop to traverse the enire array
            for (int j = i + 1; j < a.length; j++) {
                // If the current index value (j) is less than the previous index (i) the
                // following will occur
                if (a[j] > min) {
                    min = a[j]; // Reassigning the min index value
                    minIndex = j; // Reassigning the min index
                }
            } // for loop
            a[minIndex] = a[i]; // Swapping the min index and the current index value
            a[i] = min; // Swapping the current index value to the min index value

        } // for loop

        return a; // Returing the sorted array

    } // selectionSortDecending Method

    /**
     * This method sorts an array in Ascending order using InsertionSort
     * 
     * @param a
     * @return the sorted array
     * 
     */
    public static int[] insertionSortAscending(int[] a) {

        int item, j;
        boolean keepSearching;

        // Loop to traverse the entire array
        for (int k = 1; k < a.length; k++) {
            item = a[k]; // Storing the current index value to the item placeholder
            j = k - 1; // Decrementing the secondary loop condition to narrow in on the array
            keepSearching = true; // Making the Flag true
            // Loop to continue adding elements to the array while the current location is
            // not past the beginning index
            while ((j >= 0) && keepSearching) {
                // If the current element we need to inset is less than the adjacent index (k)
                // the following will occur
                if (item < a[j]) {
                    // Swapping values
                    a[j + 1] = a[j];
                    j--; // Decrementing the index
                    // If the current index is negative the following will occur
                    if (j == -1) {
                        a[0] = item; // Insert it as the first index
                    }
                }
                // If the current item is not less than the adjacent element the following will
                // occur
                else {
                    keepSearching = false; // Setting the Flag to false
                    a[j + 1] = item; // Adding the item after the current insertion location
                }
            } // while loop

        } // for loop

        return a; // Returing the sorted array

    } // insertionSortAscending Method

    /**
     * This method sorts an array in Decending order using InsertionSort
     * 
     * @param a
     * @return the sorted array
     * 
     */
    public static int[] insertionSortDecending(int[] a) {

        int item, j;
        boolean keepSearching;

        // Loop to traverse the entire array
        for (int k = 1; k < a.length; k++) {
            item = a[k]; // Storing the current index value to the item placeholder
            j = k - 1; // Decrementing the secondary loop condition to narrow in on the array
            keepSearching = true; // Making the Flag true
            // Loop to continue adding elements to the array while the current location is
            // not past the beginning index
            while ((j >= 0) && keepSearching) {
                // If the current element we need to inset is less than the adjacent index (k)
                // the following will occur
                if (item > a[j]) {
                    // Swapping values
                    a[j + 1] = a[j];
                    j--; // Decrementing the index
                    // If the current index is negative the following will occur
                    if (j == -1) {
                        a[0] = item; // Insert it as the first index
                    }
                }
                // If the current item is not less than the adjacent element the following will
                // occur
                else {
                    keepSearching = false; // Setting the Flag to false
                    a[j + 1] = item; // Adding the item after the current insertion location
                }
            } // while loop

        } // for loop

        return a; // Returing the sorted array

    } // insertionSortDecending Method

    // Helper Methods

    /**
     * This method tests the Ascending Algorithms
     * 
     * @param a
     * @return if the test passed or failed
     */
    private static String testAscending(int[] a) {
        if (a[0] <= a[1]) {
            return "Test Passed";
        }
        return "Test Failed";
    } // testAscending Method

    /**
     * This method tests the Decending Algorithms
     * 
     * @param a
     * @return if the test passed or failed
     */
    private static String testDecending(int[] a) {
        if (a[0] >= a[1]) {
            return "Test Passed";
        }
        return "Test Failed";
    } // testDecending Methods

    /**
     * This method tests the Algorithms in this class
     * 
     * @param args
     */
    public static void main(String[] args) {

        int[] array = new int[] { 1, 5, 0, 9, 10, 12, 2, -3, 45, 51, 100023 };

        // Testing BubbleSort Methods
        System.out.println("BubbleSort Ascending - " + testAscending(bubbleSortAscending(array)));
        System.out.println("BubbleSort Decending - " + testDecending(bubbleSortDecending(array)));

        // Testing SelectionSort Methods
        System.out.println("SelectionSort Ascending - " + testAscending(selectionSortAscending(array)));
        System.out.println("SelectionSort Decending - " + testDecending(selectionSortDecending(array)));

        // Testing InsertionSort Methods
        System.out.println("InsertionSort Ascending - " + testAscending(insertionSortAscending(array)));
        System.out.println("InsertionSort Decending - " + testDecending(insertionSortDecending(array)));

    } // main Method

} // SortingMethods CLass
