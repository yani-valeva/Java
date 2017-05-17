import java.util.Scanner;

public class FitStringInTwentyChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int length = 20;

       if (text.length() >= 20){
           text = text.substring(0, 20);
       } else {
          text = text + starDrawing("*", length - text.length());
       }

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
