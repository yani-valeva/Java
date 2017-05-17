import java.util.Scanner;

public class ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String start = "<upcase>";
        String end = "</upcase>";

        int startIndex = text.indexOf(start);
        int endIndex = text.indexOf(end);
        String currentText = "";
        String textAndTags = "";

        while (startIndex != -1 && endIndex != - 1){
            currentText = text.substring(startIndex + start.length(), endIndex);
            textAndTags = text.substring(startIndex, endIndex + end.length());
            text = text.replace(textAndTags, currentText.toUpperCase());

            startIndex = text.indexOf(start, startIndex + 1);
            endIndex = text.indexOf(end, endIndex + 1);
        }

        System.out.println(text);
    }
}
