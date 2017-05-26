import java.math.BigDecimal;
import java.util.Scanner;

public class BeverageLabels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productName = scanner.nextLine();
        int volume = Integer.parseInt(scanner.nextLine());
        int energy = Integer.parseInt(scanner.nextLine());
        int sugar = Integer.parseInt(scanner.nextLine());

        double energyContent = (energy / 100.0) * volume;
        double sugarContent = (sugar / 100.0) * volume;

        System.out.println(String.format("%dml %s:", volume, productName));
        System.out.println(String.format("%skcal, %sg sugars",
                new BigDecimal(energyContent).setScale(2, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toPlainString(),
                new BigDecimal(sugarContent).setScale(2, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toPlainString()));
    }
}
