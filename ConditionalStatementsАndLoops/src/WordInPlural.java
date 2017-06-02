import java.util.Scanner;

public class WordInPlural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();

        if (word.endsWith("y"))
        {
            word = word.substring(0, word.length() - 1);
            System.out.printf("%sies%n", word);
        }
        else if (word.endsWith("o") || word.endsWith("ch") ||
                word.endsWith("s") || word.endsWith("sh") ||
                word.endsWith("x") || word.endsWith("z"))
        {
            System.out.printf("%ses%n", word);
        }
        else
        {
            System.out.printf("%ss%n", word);
        }
    }
}
