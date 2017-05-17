import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersAsString = scanner.nextLine().split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        int length = 1;
        int maxLength = 0;
        int position = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]){
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
