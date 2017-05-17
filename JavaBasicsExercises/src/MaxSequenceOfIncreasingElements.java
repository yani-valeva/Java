import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int length = 1;
        int maxLength = 0;
        int position = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]){
                length++;
                if (i == numbers.length - 2 && maxLength < length)
                {
                    maxLength = length;
                    position = i + 2 - length;
                }
            }  else {
                if (maxLength < length)
                {
                    maxLength = length;
                    position = i + 1 - length;
                }

                length = 1;
            }
        }

        for (int i = position; i < position + maxLength; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
