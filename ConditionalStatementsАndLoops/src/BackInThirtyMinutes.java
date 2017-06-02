import java.util.Scanner;

public class BackInThirtyMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 30 + (hours * 60);
        hours = minutes / 60;
        minutes = minutes % 60;

        if (hours > 23)
        {
            hours -= 24;
        }

        System.out.println(String.format("%d:%02d", hours, minutes));
    }
}
