import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Map<String, String> phonebook = new TreeMap<>();

        while (!input[0].equals("END")){
            if (input[0].equals("A")){
                phonebook.put(input[1], input[2]);
            } else if (input[0].equals("S")){
                printContact(input, phonebook);
            } else if (input[0].equals("ListAll")){
                for (String key : phonebook.keySet()){
                    System.out.println(String.format("%s -> %s", key, phonebook.get(key)));
                }
            }

            input = scanner.nextLine().split(" ");
        }
    }

    public static void printContact(String[] input, Map<String, String> phonebook){
        String key = input[1];
        if (phonebook.containsKey(key)){
            System.out.println(String.format("%s -> %s", key, phonebook.get(key)));
        } else {
            System.out.println(String.format("Contact %s does not exist.", key));
        }
    }
}
