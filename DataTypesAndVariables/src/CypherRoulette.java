import java.util.Scanner;

public class CypherRoulette {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        int spinCount = 0;
        String previousLine = "";

        for (int i = 0; i < number; i++)
        {
            String currentLine = scanner.nextLine();

            if (currentLine.equals(previousLine))
            {
                sb.delete(0, sb.length());
                previousLine = currentLine;

                if (previousLine.equals("spin"))
                {
                    number++;
                }

                continue;
            }

            if (currentLine.equals("spin"))
            {
                spinCount++;
                number++;
                previousLine = currentLine;
                continue;
            }

            if (spinCount % 2 != 0)
            {
                sb.insert(0, currentLine);
                previousLine = currentLine;
                continue;
            }

            sb.append(currentLine);
            previousLine = currentLine;
        }

        System.out.println(sb.toString());
    }
}
