import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int count = 1;
        int maxCount = 0;
        int mostFrequentNumber = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentNumber = numbers[i];
            }
            count = 1;
        }
        System.out.println(mostFrequentNumber);
    }
}
