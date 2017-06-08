import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstOperand = Integer.parseInt(scanner.nextLine());
        String operatorType = scanner.nextLine();
        int secondOperand = Integer.parseInt(scanner.nextLine());
        printResult(operatorType, firstOperand, secondOperand);
    }

    private static void printResult(String operatorType, int firstOperand, int secondOperand)
    {
        switch (operatorType)
        {
            case "+":
                System.out.printf("%d + %d = %d", firstOperand, secondOperand, firstOperand + secondOperand);
                break;
            case "-":
                System.out.printf("%d - %d = %d", firstOperand, secondOperand, firstOperand - secondOperand);
                break;
            case "*":
                System.out.printf("%d * %d = %d", firstOperand, secondOperand, firstOperand * secondOperand);
                break;
            case "/":
                System.out.printf("%d / %d = %d", firstOperand, secondOperand, firstOperand / secondOperand);
                break;
        }
    }
}
