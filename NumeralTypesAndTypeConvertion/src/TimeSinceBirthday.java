import java.util.Scanner;

public class TimeSinceBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        int days = years * 365;
        int hours = days * 24;
        int minutes = hours * 60;

        System.out.printf("%d years = %d days = %d hours = %d minutes%n", years, days, hours, minutes);
    }
}
