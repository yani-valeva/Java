import java.text.DecimalFormat;
import java.util.Scanner;

public class BpmCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bpm = Integer.parseInt(scanner.nextLine());
        int beats = Integer.parseInt(scanner.nextLine());

        double bars = beats / 4.0;
        double secondsForBeat = 60.0 / bpm;
        double totalSeconds = beats * secondsForBeat;

        int minute = (int)totalSeconds / 60;
        int seconds = (int)totalSeconds % 60;
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.printf("%s bars - %dm %ds", df.format(bars), minute, seconds);
    }
}
