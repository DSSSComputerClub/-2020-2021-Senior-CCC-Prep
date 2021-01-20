public class ArrayDeepDive2D {
    public static void main(String[] args) {

        // Ways to declare a 2D array
        int intArray[][] = new int[2][2];
        int intArray2[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        int intArray3[][];
        intArray3 = new int[2][2];

        System.out.println("Method 1 of outputting using a loop");
        for (int i = 0; i < intArray2.length; i++) {
            for (int j = 0; j < intArray2[i].length; j++) {
                System.out.print(intArray2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Method 2 of outputting using a loop");
        for (int[] is : intArray2) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }

    }
}
