import java.util.Scanner;

public class ChooseDrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String profession = scanner.nextLine();

        switch (profession)
        {
            case "Athlete":
                System.out.println("Water");
                break;
            case "Businessman":
            case "Businesswoman":
                System.out.println("Coffee");
                break;
            case "SoftUni Student":
                System.out.println("Beer");
                break;
            default:
                System.out.println("Tea");
                break;
        }
    }
}
