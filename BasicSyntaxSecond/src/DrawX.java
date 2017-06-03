import java.util.Scanner;

public class DrawX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int innerSpaces = number - 2;
        int leftRightSpaces = 0;

        for (int i = 1; i <= number / 2; i++) {
            System.out.println(String.format(drawingMethod(" ", leftRightSpaces) + "x" + drawingMethod(" ", innerSpaces)) + "x" + drawingMethod(" ", leftRightSpaces));
            innerSpaces -= 2;
            leftRightSpaces++;
        }

        int spaces = (number - 1) / 2;

        System.out.println(String.format(drawingMethod(" ", spaces)) + "x" + drawingMethod(" ", spaces));

        innerSpaces += 2;
        leftRightSpaces--;

        for (int i = 1; i <= number / 2; i++) {
            System.out.println(String.format(drawingMethod(" ", leftRightSpaces) + "x" + drawingMethod(" ", innerSpaces)) + "x" + drawingMethod(" ", leftRightSpaces));
            innerSpaces += 2;
            leftRightSpaces--;
        }
    }

    public static String drawingMethod(String text, int repeatCount) {
        String output = "";

        for (int i = 0; i < repeatCount; i++) {
            output += text;
        }
        return output;
    }
}
