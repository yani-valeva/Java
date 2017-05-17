import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vowel = scanner.nextLine();

        if(vowel.equals("a") || vowel.equals("e") || vowel.equals("i") || vowel.equals("o") || vowel.equals("u")){
            System.out.println("vowel");
        } else if (vowel.equals("0") || vowel.equals("1") || vowel.equals("2") || vowel.equals("3") || vowel.equals("4")
                || vowel.equals("5") || vowel.equals("6") || vowel.equals("7") || vowel.equals("8") || vowel.equals("9")){
            System.out.println("digit");
        } else {
            System.out.println("other");
        }
    }
}
