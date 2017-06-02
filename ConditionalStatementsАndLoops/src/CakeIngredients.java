import java.util.Scanner;

public class CakeIngredients {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ingredient = scanner.nextLine();
        int count = 0;

        while (!ingredient.equals("Bake!"))
        {
            System.out.printf("Adding ingredient %s.%n", ingredient);
            count++;
            ingredient = scanner.nextLine();
        }

        System.out.printf("Preparing cake with %d ingredients.%n", count);
    }
}
