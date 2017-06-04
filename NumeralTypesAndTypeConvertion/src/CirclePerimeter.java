import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());
        double perimeter = 2 * Math.PI * radius;

        System.out.printf("%.12f", perimeter);
    }
}
