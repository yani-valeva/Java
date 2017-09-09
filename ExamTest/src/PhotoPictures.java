import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhotoPictures {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int picturesCount = Integer.parseInt(reader.readLine());
        String pictureType = reader.readLine();
        String orderType = reader.readLine();
        double price = 0.0;

        switch (pictureType) {
            case "9X13":
                price = picturesCount * 0.16;
                if (picturesCount > 50) {
                    price -= price * 0.05;
                }
                break;
            case "10X15":
                price = picturesCount * 0.16;
                if (picturesCount > 80) {
                    price -= price * 0.03;
                }
                break;

            case "13X18":
                price = picturesCount * 0.38;
                if (picturesCount >= 50 && picturesCount <= 100) {
                    price -= price * 0.03;
                } else if (picturesCount > 100) {
                    price -= price * 0.05;
                }
                break;

            case "20X30":
                price = picturesCount * 2.90;
                if (picturesCount >= 10 && picturesCount <= 50) {
                    price -= price * 0.07;
                } else if (picturesCount > 50) {
                    price -= price * 0.09;
                }
                break;
        }

        if (orderType.equals("online")) {
            price -= price * 0.02;
        }

        System.out.println(String.format("%.2fBGN", price));
    }
}
