import java.util.Scanner;

public class DrinkPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String profession = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (profession)
        {
            case "Athlete":
                System.out.println(String.format("The %s has to pay %.2f.", profession, quantity * 0.70));
                break;
            case "Businessman":
            case "Businesswoman":
                System.out.println(String.format("The %s has to pay %.2f.", profession, quantity * 1.0));
                break;
            case "SoftUni Student":
                System.out.println(String.format("The %s has to pay %.2f.", profession, quantity * 1.70));
                break;
            default:
                System.out.println(String.format("The %s has to pay %.2f.", profession, quantity * 1.20));
                break;
        }
    }
}
