import java.util.Scanner;

public class GrapeAndRakia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vineyardArea = Double.parseDouble(scanner.nextLine());
        double kgGrapePerSquareMeter = Double.parseDouble(scanner.nextLine());
        double wasteGrape = Double.parseDouble(scanner.nextLine());

        double kgGrape = (vineyardArea * kgGrapePerSquareMeter) - wasteGrape;
        double grapeForRakia = 45 / 100.0 * kgGrape;
        double litersRakia = grapeForRakia / 7.5;
        double rakiaProfit = litersRakia * 9.80;
        double grapeForSale =  55 / 100.0 * kgGrape;
        double grapeProfit = grapeForSale * 1.50;

        System.out.printf("%.2f%n", rakiaProfit);
        System.out.printf("%.2f%n", grapeProfit);
    }
}
