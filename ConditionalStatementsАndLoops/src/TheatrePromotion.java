import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 0;

        if (age < 0 || age > 122)
        {
            System.out.println("Error!");
            return;
        }

        switch (dayType)
        {
            case "weekday":
                if (age >= 0 && age <= 18 || age > 64 && age <= 122)
                {
                    ticketPrice = 12;
                }
                else if (age > 18 && age <= 64)
                {
                    ticketPrice = 18;
                }
                break;
            case "weekend":
                if (age >= 0 && age <= 18 || age > 64 && age <= 122)
                {
                    ticketPrice = 15;
                }
                else if (age > 18 && age <= 64)
                {
                    ticketPrice = 20;
                }
                break;
            case "holiday":
                if (age >= 0 && age <= 18)
                {
                    ticketPrice = 5;
                }
                else if (age > 18 && age <= 64)
                {
                    ticketPrice = 12;
                }
                else if (age > 64 && age <= 122)
                {
                    ticketPrice = 10;
                }
                break;
        }

        System.out.printf("%d$%n", ticketPrice);
    }
}
