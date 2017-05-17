import java.util.Scanner;

public class TrainersSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lectures = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        int jelevCount = 0;
        int royalCount = 0;
        int roliCount = 0;
        int trofonCount = 0;
        int sinoCount = 0;
        int othersCount = 0;

        for (int i = 0; i < lectures; i++) {
            String lecturer = scanner.nextLine();

            switch (lecturer){
                case "Jelev":
                    jelevCount++;
                    break;
                case "RoYaL":
                    royalCount++;
                    break;
                case "Roli":
                    roliCount++;
                    break;
                case "Trofon":
                    trofonCount++;
                    break;
                case "Sino":
                    sinoCount++;
                    break;
                default:
                    othersCount++;
                    break;
            }
        }

        double money = budget / lectures;
        double jelevSalary = jelevCount * money;
        double royalSalary = royalCount * money;
        double roliSalary = roliCount * money;
        double trofonSalary = trofonCount * money;
        double sinoSalary = sinoCount * money;
        double othersSalary = othersCount * money;

        System.out.println(String.format("Jelev salary: %.2f lv", jelevSalary));
        System.out.println(String.format("RoYaL salary: %.2f lv", royalSalary));
        System.out.println(String.format("Roli salary: %.2f lv", roliSalary));
        System.out.println(String.format("Trofon salary: %.2f lv", trofonSalary));
        System.out.println(String.format("Sino salary: %.2f lv", sinoSalary));
        System.out.println(String.format("Others salary: %.2f lv", othersSalary));
    }
}
