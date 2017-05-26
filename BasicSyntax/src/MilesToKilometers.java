import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double miles = Double.parseDouble(scanner.nextLine());
        double kilometers = miles * 1.60934;

        System.out.println(String.format("%.2f", kilometers));
    }
}
