import java.util.Scanner;

public class CharacterStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int currentHealth = Integer.parseInt(scanner.nextLine());
        int maximumHealth = Integer.parseInt(scanner.nextLine());
        int currentEnergy = Integer.parseInt(scanner.nextLine());
        int maximumEnergy = Integer.parseInt(scanner.nextLine());

        int healthDiff = maximumHealth - currentHealth;
        int energyDiff = maximumEnergy - currentEnergy;

        System.out.println(String.format("Name: %s", name));
        System.out.println("Health: |" + drawingMethod("|", currentHealth) + drawingMethod(".", healthDiff) + "|");
        System.out.println("Energy: |" + drawingMethod("|", currentEnergy) + drawingMethod(".", energyDiff) + "|");
    }

    public static String drawingMethod(String text, int repeatCount) {
        String output = "";

        for (int i = 0; i < repeatCount; i++) {
             output += text;
        }

        return output;
    }
}
