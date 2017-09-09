import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int width = Integer.parseInt(reader.readLine());
        int length = Integer.parseInt(reader.readLine());
        String piecesStr = reader.readLine();
        int area = width * length;
        while (!piecesStr.equals("STOP")) {
            int pieces = Integer.parseInt(piecesStr);
            if (area < pieces) {
                System.out.println(String.format("No more cake left! You need %d pieces more.", pieces - area));
                return;
            }
            area -= pieces;
            piecesStr = reader.readLine();
        }

        System.out.println(String.format("%d pieces are left.", area));
    }
}
