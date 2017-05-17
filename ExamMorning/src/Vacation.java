import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String accommodation = "";
        String location = "";
        double price = 0.0;

        switch (season){
            case "Summer":
                location = "Alaska";
                break;
            case "Winter":
                location = "Morocco";
                break;
        }
        if (budget <= 1000){
            accommodation = "Camp";
            switch (season){
                case "Summer":
                    price = 0.65 * budget;
                    break;
                case "Winter":
                    price = 0.45 * budget;
                    break;
            }
        } else if (budget <= 3000){
            accommodation = "Hut";
            switch (season){
                case "Summer":
                    price = 0.80 * budget;
                    break;
                case "Winter":
                    price = 0.60 * budget;
                    break;
            }
        } else {
            accommodation = "Hotel";
            price = 0.90 * budget;
        }

        System.out.println(String.format("%s - %s - %.2f", location, accommodation, price));
    }
}
