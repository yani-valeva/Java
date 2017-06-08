import java.util.Scanner;

public class TrickyStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String delimiter = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number; i++) {
            String currentLine = scanner.nextLine();

            if (i == number - 1) {
                sb.append(currentLine);
            } else {
                sb.append(currentLine + delimiter);
            }
        }

        System.out.println(sb.toString());
    }
}
