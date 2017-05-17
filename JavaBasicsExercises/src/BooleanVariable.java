import java.util.Scanner;

public class BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        boolean isTrue = Boolean.parseBoolean(word);

        if(isTrue){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
