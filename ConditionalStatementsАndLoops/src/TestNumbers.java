import java.util.Scanner;

public class TestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int boundary = Integer.parseInt(scanner.nextLine());

        int result = 0;
        int count = 0;

        for (int firstDigit = firstNumber; firstDigit >= 1; firstDigit--)
        {
            for (int secondDigit = 1; secondDigit <= secondNumber; secondDigit++)
            {
                result += firstDigit * secondDigit * 3;
                count++;

                if (result >= boundary)
                {
                    System.out.println(String.format("%d combinations", count));
                    System.out.println(String.format("Sum: %d >= %d", result, boundary));
                    return;
                }
            }
        }

        System.out.println(String.format("%d combinations", count));
        System.out.println(String.format("Sum: %d", result));
    }
}
