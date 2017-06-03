import java.util.Scanner;

public class SMSTyping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int charactersNumber = Integer.parseInt(scanner.nextLine());
        StringBuilder sms = new StringBuilder();


        for (int i = 0; i < charactersNumber; i++)
        {
            String input = scanner.nextLine();

            if (input.equals("0"))
            {
                sms.append(" ");
                continue;
            }

            int digitsNumber = input.length();
            int mainDigit = Integer.parseInt(input) % 10;
            int offset = !(mainDigit == 8 || mainDigit == 9) ? (mainDigit - 2) * 3 : ((mainDigit - 2) * 3) + 1;
            int letterIndex = offset + digitsNumber - 1;
            char currentLetter = (char)(letterIndex + 97);
            sms.append(currentLetter);
        }

        System.out.println(sms.toString());
    }
}
