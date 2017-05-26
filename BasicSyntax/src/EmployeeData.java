import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int employeeId = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.println(String.format("Name: %s", name));
        System.out.println(String.format("Age: %d", age));;
        System.out.println(String.format("Employee ID: %08d", employeeId));
        System.out.println(String.format("Salary: %.2f", salary));
    }
}
