import java.util.Scanner;

public class NeighbourWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int damagePesho = Integer.parseInt(scanner.nextLine());
        int damageGosho = Integer.parseInt(scanner.nextLine());

        int healthPesho = 100;
        int healthGosho = 100;
        int round = 1;

        while (true)
        {
            if (round % 2 != 0)
            {
                healthGosho -= damagePesho;

                if (healthGosho <= 0)
                {
                    System.out.println(String.format("Pesho won in %dth round.", round));
                    return;
                }

                System.out.println(String.format("Pesho used Roundhouse kick and reduced Gosho to %d health.", healthGosho));
            }
            else
            {
                healthPesho -= damageGosho;

                if (healthPesho <= 0)
                {
                    System.out.println(String.format("Gosho won in %dth round.", round));
                    return;
                }

                System.out.println(String.format("Gosho used Thunderous fist and reduced Pesho to %d health.", healthPesho));
            }

            if (round % 3 == 0)
            {
                healthPesho += 10;
                healthGosho += 10;
            }

            round++;
        }
    }
}
