import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] alphabet = new char[26];
        int index = 0;

        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabet[index] = letter;
            index++;
        }

        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (word.charAt(i) == alphabet[j]){
                    System.out.println(String.format("%c -> %d", word.charAt(i), j));
                    break;
                }
            }
        }
    }
}
