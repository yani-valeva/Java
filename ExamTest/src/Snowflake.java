import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snowflake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int innerDots = number;
        int outerDots = 0;

        for (int i = 1; i < number; i++) {
            System.out.println(drawingMethod(".", outerDots) + "*" + drawingMethod(".", innerDots) + "*" + drawingMethod(".", innerDots) + "*" + drawingMethod(".", outerDots));
            innerDots--;
            outerDots++;
        }

        System.out.println(drawingMethod(".", outerDots) + "*****" + drawingMethod(".", outerDots));
        System.out.println(drawingMethod("*", (2 * number) + 3));
        System.out.println(drawingMethod(".", outerDots) + "*****" + drawingMethod(".", outerDots));

        innerDots++;
        outerDots--;

        for (int i = 1; i < number; i++) {
            System.out.println(drawingMethod(".", outerDots) + "*" + drawingMethod(".", innerDots) + "*" + drawingMethod(".", innerDots) + "*" + drawingMethod(".", outerDots));
            innerDots++;
            outerDots--;
        }
    }

    public static String drawingMethod(String text, int repeatCount) {
        String output = "";

        for (int i = 0; i < repeatCount; i++){
            output += text;
        }
        return  output;
    }
}
