import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());
        double salary = 0.0;

        if (kmPerMonth > 10_000) {
            salary += kmPerMonth * 1.45 * 4;
        } else {
            switch (season) {
                case "Spring":
                case "Autumn":
                    if (kmPerMonth <= 5000) {
                        salary += kmPerMonth * 0.75 * 4;
                    } else if (kmPerMonth <= 10000) {
                        salary += kmPerMonth * 0.95 * 4;
                    }
                    break;
                case "Summer":
                    if (kmPerMonth <= 5000) {
                        salary += kmPerMonth * 0.90 * 4;
                    } else if (kmPerMonth <= 10000) {
                        salary += kmPerMonth * 1.10 * 4;
                    }
                    break;
                case "Winter":
                    if (kmPerMonth <= 5000) {
                        salary += kmPerMonth * 1.05 * 4;
                    } else if (kmPerMonth <= 10000) {
                        salary += kmPerMonth * 1.25 * 4;
                    }
                    break;
            }
        }
        salary -= 0.1 * salary;
        System.out.printf("%.2f%n", salary);
    }
}
