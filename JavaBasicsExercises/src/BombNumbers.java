import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> bombAndPower = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int bomb = bombAndPower.get(0);
        int power = bombAndPower.get(1);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bomb) {
                int startIndex = i - power;
                int endIndex = i + power;

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > numbers.size() - 1) {
                    endIndex = numbers.size() - 1;
                }

                int count = endIndex + 1 - startIndex;
                numbers.subList(startIndex, startIndex + count).clear();
                i = -1;
            }
        }

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        System.out.println(sum);
    }
}