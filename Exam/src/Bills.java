import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double electricity = 0.0;
        double otherBills = 0.0;

        for (int i = 0; i < months; i++) {
            double currentElectricity = Double.parseDouble(scanner.nextLine());
            electricity += currentElectricity;
            otherBills += (currentElectricity + 20 + 15) + (0.2 * (currentElectricity + 20 + 15));
        }

        double water = months * 20;
        double internet = months * 15;
        double averageExpense = (electricity + water + internet + otherBills) / months;

        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", otherBills);
        System.out.printf("Average: %.2f lv%n", averageExpense);
    }
}
