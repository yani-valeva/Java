import java.util.Scanner;

public class TrainingHallEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int itemsNumber = Integer.parseInt(scanner.nextLine());

        double totalSum = 0.0;

        for (int i = 0; i < itemsNumber; i++)
        {
            String itemName = scanner.nextLine();
            double itemPrice = Double.parseDouble(scanner.nextLine());
            int itemCount = Integer.parseInt(scanner.nextLine());

            String nameByCount = itemCount > 1 ? String.format("%ss", itemName) : String.format("%s", itemName);

            System.out.printf("Adding %d %s to cart.%n", itemCount, nameByCount);
            totalSum += itemCount * itemPrice;
        }

        double diff = budget - totalSum;

        System.out.printf("Subtotal: $%.2f%n", totalSum);
        System.out.println(diff >= 0 ? String.format("Money left: $%.2f", diff) : String.format("Not enough. We need $%.2f more.", Math.abs(diff)));
    }
}
