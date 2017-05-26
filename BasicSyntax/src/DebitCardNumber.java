import java.util.Scanner;

public class DebitCardNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourthNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(String.format("%04d %04d %04d %04d", firstNumber, secondNumber, thirdNumber, fourthNumber));
    }
}
