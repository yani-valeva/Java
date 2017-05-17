import java.util.Scanner;

public class TwoNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = startNumber; i >= endNumber; i--) {
            for (int j = startNumber; j >= endNumber; j--) {
                count++;

                if (i + j == magicNumber){
                    System.out.println(String.format("Combination N:%d (%d + %d = %d)", count, i, j, magicNumber));
                    return;
                }
            }
        }
        System.out.println(String.format("%d combinations - neither equals %d", count, magicNumber));
    }
}
