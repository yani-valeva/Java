import java.util.Scanner;

public class Cups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int glassesNumber = Integer.parseInt(scanner.nextLine());
        int workersNumber = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        int workingHours = workersNumber * workingDays * 8;
        double madeGlasses = Math.floor(workingHours / 5.0);
        double difference = Math.abs(glassesNumber - madeGlasses);
        double money = difference * 4.2;

        if (glassesNumber > madeGlasses){
            System.out.println(String.format("Losses: %.2f", money));
        } else {
            System.out.println(String.format("%.2f extra money", money));
        }
    }
}
