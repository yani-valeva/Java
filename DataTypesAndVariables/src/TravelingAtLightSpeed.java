import java.util.Scanner;

public class TravelingAtLightSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lightYearsCount = Double.parseDouble(scanner.nextLine());
        double lightYearKm = 9450000000000.0;
        double lightSpeed = 300000.0;

        double totalSeconds = (lightYearKm / lightSpeed) * lightYearsCount;
        int weeks = (int)totalSeconds / 60 / 60 / 24 / 7;
        int days = (int)totalSeconds / 60 / 60 / 24 % 7;
        int hours = (int)totalSeconds / 60 / 60 % 24;
        int minutes = (int)totalSeconds / 60 % 60;
        int seconds = (int)totalSeconds % 60;

        System.out.printf("%d weeks%n%d days%n%d hours%n%d minutes%n%d seconds", weeks, days, hours, minutes, seconds);
    }
}
