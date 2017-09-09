import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Profit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOne = Integer.parseInt(reader.readLine());
        int countTwo = Integer.parseInt(reader.readLine());
        int countFive = Integer.parseInt(reader.readLine());
        int sum = Integer.parseInt(reader.readLine());

        for (int i = 0; i <= countOne; i++) {
            for (int j = 0; j <= countTwo; j++) {
                for (int k = 0; k <= countFive; k++) {
                    if ((i * 1) + (j * 2) + (k * 5) == sum) {
                        System.out.println(String.format("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %s lv.", i, j, k, sum));
                    }
                }
            }
        }
    }
}
