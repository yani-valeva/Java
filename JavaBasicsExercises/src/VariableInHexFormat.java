import java.util.Scanner;

public class VariableInHexFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberInHexFormat = scanner.nextLine();
        int numberInDecFormat = Integer.parseInt(numberInHexFormat, 16);

        System.out.println(numberInDecFormat);
    }
}
