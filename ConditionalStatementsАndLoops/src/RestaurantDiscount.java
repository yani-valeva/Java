import java.util.Scanner;

public class RestaurantDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String servicePackage = scanner.nextLine();
        double hallPrice = 0.0;
        String hallName = "";

        if (people <= 50)
        {
            hallPrice = 2500;
            hallName = "Small Hall";
        }
        else if (people <= 100)
        {
            hallPrice = 5000;
            hallName = "Terrace";
        }
        else if (people <= 120)
        {
            hallPrice = 7500;
            hallName = "Great Hall";
        }
        else
        {
            System.out.println("We do not have an appropriate hall.");
            return;
        }

        double discount = 0.0;
        double packagePrice = 0.0;

        switch (servicePackage)
        {
            case "Normal":
                discount = 0.05;
                packagePrice = 500;
                break;
            case "Gold":
                discount = 0.1;
                packagePrice = 750;
                break;
            case "Platinum":
                discount = 0.15;
                packagePrice = 1000;
                break;
        }

        double totalPrice = (hallPrice + packagePrice) - ((hallPrice + packagePrice) * discount);
        double pricePerPerson = totalPrice / people;

        System.out.println(String.format("We can offer you the %s", hallName));
        System.out.println(String.format("The price per person is %.2f$", pricePerPerson));
    }
}
