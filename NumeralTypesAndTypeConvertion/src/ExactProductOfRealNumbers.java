import java.util.Scanner;

public class ExactProductOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = Integer.parseInt(scanner.nextLine());
        double product = 1.0;

        for (int i = 0; i < numberCount; i++)
        {
            double currentNumber = Double.parseDouble(scanner.nextLine());
            product *= currentNumber;
        }

        System.out.println(product);
    }
}
