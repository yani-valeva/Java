import java.util.Scanner;

public class CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        String text = scanner.nextLine();

        String[] emailInfo = email.split("@");
        String userName = emailInfo[0];
        String domain = emailInfo[1];
        String replacement = starDrawing("*", userName.length()) + "@" + domain;
        text = text.replace(email, replacement);

        System.out.println(text);
    }

    public static String starDrawing(String symbol, int repeatCount) {
        String output = "";

        for (int i = 0; i < repeatCount; i++){
            output += symbol;
        }
        return  output;
    }
}
