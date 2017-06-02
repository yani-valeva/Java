import java.util.Scanner;

public class IntervalOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int min = Math.min(firstNumber, secondNumber);
        int max = Math.max(firstNumber, secondNumber);

        for (int i = min; i <= max; i++)
        {
            System.out.println(i);;
        }
    }
}
