import java.util.Arrays;
import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstCharArray = scanner.nextLine().split(" ");
        String[] secondCharArray = scanner.nextLine().split(" ");

        int minLength = Math.min(firstCharArray.length, secondCharArray.length);
        String first = Arrays.toString(firstCharArray);
        String second = Arrays.toString(secondCharArray);

        for (int i = 0; i < minLength; i++) {
            if(firstCharArray[i].compareTo(secondCharArray[i]) > 0){

                System.out.println(second.replaceAll("\\[|]|,| ", ""));
                System.out.println(first.replaceAll("\\[|]|,| ", ""));
                break;
            } else if (firstCharArray[i].compareTo(secondCharArray[i]) < 0){
                System.out.println(first.replaceAll("\\[|]|,| ", ""));
                System.out.println(second.replaceAll("\\[|]|,| ", ""));
                break;
            } else {
                if (i == minLength - 1 && firstCharArray.length <= secondCharArray.length){
                    System.out.println(first.replaceAll("\\[|]|,| ", ""));
                    System.out.println(second.replaceAll("\\[|]|,| ", ""));
                    break;
                } else if (i == minLength - 1 && firstCharArray.length > secondCharArray.length){
                    System.out.println(second.replaceAll("\\[|]|,| ", ""));
                    System.out.println(first.replaceAll("\\[|]|,| ", ""));
                }
            }
        }
    }
}
