import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sum = firstNumber + secondNumber;

        System.out.println(String.format("%d + %d = %d", firstNumber, secondNumber, sum));
    }
}
