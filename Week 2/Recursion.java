public class Recursion {

    private static int power(int base, int n) {

        // If the exponent (n) is less than or equal to 1 we return the base
        if (n <= 1) {
            return base;
        }
        // If the exponent (n) is greater than 1 we recursively call this method
        return base * power(base, n - 1);
    }

    public static void main(String[] args) {
        int value = power(2, 3); // Calling the power method
        System.out.println(value); // Outputting the answer
    }

}
