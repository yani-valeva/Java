import java.util.Scanner;

public class GameOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int currentFirst = 0;
        int currentSecond = 0;
        boolean isFound = false;
        int count = 0;

        for (int i = firstNumber; i <= secondNumber; i++)
        {
            for (int j = firstNumber; j <= secondNumber; j++)
            {
                if (i + j == magicNumber)
                {
                    currentFirst = i;
                    currentSecond = j;
                    isFound = true;
                }

                count++;
            }
        }

        if (isFound)
        {
            System.out.println(String.format("Number found! %d + %d = %d", currentFirst, currentSecond, magicNumber));
        }
        else
        {
            System.out.println(String.format("%d combinations - neither equals %d", count, magicNumber));
        }
    }
}
