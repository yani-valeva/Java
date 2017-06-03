import java.util.Scanner;

public class DNASequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matchSum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 4; j++)
            {
                for (int k = 1; k <= 4; k++) {
                    int currentSum = i + j + k;
                    String startEnd = currentSum >= matchSum ? "O" : "X";
                    String firstNucleotid = getNucleotid(i);
                    String secondNucleotid = getNucleotid(j);
                    String thirdNucleotid = getNucleotid(k);

                    System.out.printf("%s%s%s%s%s ", startEnd, firstNucleotid, secondNucleotid, thirdNucleotid, startEnd);
                }
                System.out.println();
            }
        }
    }

    private static String getNucleotid(int number)
    {
        String currentNucleotid = "";
        switch (number)
        {
            case 1:
                currentNucleotid = "A";
                break;
            case 2:
                currentNucleotid = "C";
                break;
            case 3:
                currentNucleotid = "G";
                break;
            case 4:
                currentNucleotid = "T";
                break;
            default:
                currentNucleotid = "0";
                break;
        }

        return currentNucleotid;
    }
}
