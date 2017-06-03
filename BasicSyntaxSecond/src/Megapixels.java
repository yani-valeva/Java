import java.text.DecimalFormat;
        import java.util.Scanner;

public class Megapixels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double megapixels = (width * height) / 1000000.0;
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println(String.format("%dx%d => %sMP", width,  height, df.format(megapixels)));
    }
}
