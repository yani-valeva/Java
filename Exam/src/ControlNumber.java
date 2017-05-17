import java.util.Scanner;

public class ControlNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int controlNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 1; j--) {
                sum += (i * 2) + (j * 3);
                count++;

                if (sum >= controlNumber) {
                    System.out.printf("%d moves%n", count);
                    System.out.printf("Score: %d >= %d%n", sum, controlNumber);
                    return;
                }
            }
        }
        System.out.printf("%d moves%n", count);
    }
}
