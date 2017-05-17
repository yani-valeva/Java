import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int tilde = n - 2;
        int dots = (2 * n) + 1;
        int innerDots = 0;

        System.out.println("+" + drawingMethod("~", tilde) + "+" + drawingMethod(".", dots));

        dots--;

        for (int row = 1; row <= (2 * n) + 1; row++)
        {
            System.out.println("|" + drawingMethod(".", innerDots) + "\\" + drawingMethod("~", tilde) + "\\" + drawingMethod(".", dots));

            innerDots++;
            dots--;
        }
        dots++;
        innerDots--;

        for (int row = 1; row <= (2 * n) + 1; row++)
        {
            System.out.println(drawingMethod(".", dots) + "\\" + drawingMethod(".", innerDots) + "|" + drawingMethod("~", tilde) + "|");

            dots++;
            innerDots--;
        }

        System.out.println(drawingMethod(".", dots) + "+" + drawingMethod("~", tilde) + "+");

    }
    public static String drawingMethod(String text, int repeatCount) {
        String output = "";

        for (int i = 0; i < repeatCount; i++){
            output += text;
        }
        return  output;
    }
}
