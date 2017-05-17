import java.util.Scanner;

public class Styrofoam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double houseArea = Double.parseDouble(scanner.nextLine());
        int windowsCount = Integer.parseInt(scanner.nextLine());
        double styrofoamPerPackage = Double.parseDouble(scanner.nextLine());
        double pricePerPackage = Double.parseDouble(scanner.nextLine());

        double totalArea = houseArea - (windowsCount * 2.4);
        totalArea += 0.1 * totalArea;
        double neededPackages = Math.ceil(totalArea / styrofoamPerPackage);
        double neededMoney = neededPackages * pricePerPackage;
        double difference = Math.abs(neededMoney - budget);

        if (neededMoney <= budget){
            System.out.printf("Spent: %.2f%n", neededMoney);
            System.out.printf("Left: %.2f%n", difference);
        } else {
            System.out.printf("Need more: %.2f%n", difference);
        }
    }
}
