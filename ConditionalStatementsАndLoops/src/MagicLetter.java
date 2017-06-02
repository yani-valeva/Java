import java.util.Scanner;

public class MagicLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.nextLine().charAt(0);
        char secondLetter = scanner.nextLine().charAt(0);
        char thirdLetter = scanner.nextLine().charAt(0);

        for (char letter1 = firstLetter; letter1 <= secondLetter; letter1++)
        {
            for (char letter2 = firstLetter; letter2 <= secondLetter; letter2++)
            {
                for (char letter3 = firstLetter; letter3 <= secondLetter; letter3++)
                {
                    if (letter1 == thirdLetter || letter2 == thirdLetter || letter3 == thirdLetter)
                    {
                        continue;
                    }

                    System.out.printf("%c%c%c ", letter1, letter2, letter3);
                }
            }
        }

        System.out.println();
    }
}
