import java.math.BigDecimal;
        import java.util.Scanner;

public class FromTerabytesToBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal terabytes = new BigDecimal(scanner.nextLine());
        BigDecimal bits = new BigDecimal(1024.0 * 1024.0 * 1024 * 1024 * 8);
        bits = bits.multiply(terabytes);

        System.out.printf("%.0f", bits);
    }
}
