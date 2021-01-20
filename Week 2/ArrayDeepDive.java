public class ArrayDeepDive {
    public static void main(String[] args) {

        // Ways to declare an array
        String stringArray[] = new String[2];
        String stringArray2[] = new String[] { "Element 1", "Element 2" };
        String stringArray3[];
        stringArray3 = new String[2];

        System.out.println("Method 1 of outputting using a loop");
        for (int i = 0; i < stringArray2.length; i++) {
            System.out.println(stringArray2[i]);
        }

        System.out.println("Method 2 of outputting using a loop");
        for (String string : stringArray2) {
            System.out.println(string);
        }

    }
}