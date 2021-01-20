public class Example {

    private static int seq(int number) {

        if (number == 1 || number == 2) {
            return 1;
        }

        return seq(number - 1) + seq(number - 2);

    }

    public static void main(String[] args) {

        int value = seq(6);
        System.out.println(value);

    }
}
