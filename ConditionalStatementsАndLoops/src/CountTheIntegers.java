import java.util.Scanner;

public class CountTheIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;

        while (true) {
            boolean isNumber = isIntegerNumber(input);

            if (isNumber) {
                count++;
            } else {
                System.out.println(count);
                return;
            }

            input = scanner.nextLine();
        }
    }

    public static boolean isIntegerNumber (String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
