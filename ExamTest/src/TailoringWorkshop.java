import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TailoringWorkshop {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int table = Integer.parseInt(reader.readLine());
        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double coverArea = table * (length + 2 * 0.30) * (width + 2 * 0.30);
        double boxArea = table * (length / 2) * (length / 2);
        double priceUsd = (coverArea * 7) + (boxArea * 9);
        double priceBgn = priceUsd * 1.85;
        System.out.println(String.format("%.2f USD", priceUsd));
        System.out.println(String.format("%.2f BGN", priceBgn));
    }
}
