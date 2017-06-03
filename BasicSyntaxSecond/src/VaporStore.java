import java.util.Scanner;

public class VaporStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double spentMoney = 0.0;
        double gamePrice = 0.0;

        if (money == 0)
        {
            System.out.println("Out of money!");
            return;
        }

        while (!game.equals("Game Time"))
        {
            switch (game)
            {
                case "OutFall 4":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                default:
                    gamePrice = 0;
                    break;
            }

            if (gamePrice == 0)
            {
                System.out.println("Not Found");
            }
            else if (money < gamePrice)
            {
                System.out.println("Too Expensive");
            }
            else
            {
                System.out.printf("Bought %s%n", game);
                money -= gamePrice;
                spentMoney += gamePrice;
            }
            if (money == 0)
            {
                System.out.println("Out of money!");
                return;
            }

            game = scanner.nextLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", spentMoney, money);
    }
}
