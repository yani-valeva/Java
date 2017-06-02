import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int currentNumber = 1;

        for (int row = 1; row <= number; row++)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.printf(currentNumber + " ");
            }

            currentNumber++;
            System.out.println();;
        }
    }
}
