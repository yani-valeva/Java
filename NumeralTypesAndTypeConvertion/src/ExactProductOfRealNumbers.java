import java.util.Scanner;

public class ExactProductOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = Integer.parseInt(scanner.nextLine());
        BigDecimal product = new BigDecimal(1);

        for (int i = 0; i < numberCount; i++)
        {
            BigDecimal currentNumber = new BigDecimal(scanner.nextLine());
            product = product.multiply(currentNumber);
        }

        System.out.println(product);
    }
}
