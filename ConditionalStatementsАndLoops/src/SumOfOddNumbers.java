import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= number; i++)
        {
            int currentNumber = (i * 2) - 1;
            sum += currentNumber;
            System.out.println(currentNumber);
        }

        System.out.printf("Sum: %d", sum);
    }
}
