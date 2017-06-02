import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        while (true) {
            if (number % 2 != 0) {
                break;
            }

            System.out.println("Please write an odd number.");
            number = Math.abs(Integer.parseInt(scanner.nextLine()));
        }

        System.out.printf("The number is: %d", number);
    }
}
