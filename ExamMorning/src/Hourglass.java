import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int dots = 1;
        int monkey = (2 * n) - 3;

        System.out.println(drawingMethod("*", (2 * n) + 1));

        for (int row = 1; row <= n; row++) {
            if (row == 1) {
                System.out.println(drawingMethod(".", dots) + "*" + drawingMethod(" ", monkey) + "*" + drawingMethod(".", dots));
            } else if (row == n) {
                System.out.println(drawingMethod(".", dots) + "*" + drawingMethod(".", dots));
            } else {
                System.out.println(drawingMethod(".", dots) + "*" + drawingMethod("@", monkey) + "*" + drawingMethod(".", dots));
            }

            dots += 1;
            monkey -= 2;
        }

        dots -= 2;
        monkey += 4;

        for (int row = 1; row <= n - 1; row++) {
            if (row == n - 1){
                System.out.println(drawingMethod(".", dots) + "*" + drawingMethod("@", monkey) + "*" + drawingMethod(".", dots));
            } else {
                System.out.println(drawingMethod(".", dots) + "*" + drawingMethod(" ", (monkey - 1) / 2) + "@" + drawingMethod(" ", (monkey - 1) / 2) + "*" + drawingMethod(".", dots));
            }

            dots -= 1;
            monkey += 2;
        }

        System.out.println(drawingMethod("*", (2 * n) + 1));
    }

    public static String drawingMethod(String text, int repeatCount) {
        String output = "";

        for (int i = 0; i < repeatCount; i++) {
            output += text;
        }
        return output;
    }
}
