import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());
        double totalStudioPrice = 0.0;
        double totalDoublePrice = 0.0;
        double totalSuitePrice = 0.0;

        switch (month)
        {
            case "May":
            case "October":
                totalStudioPrice = nightsCount * 50.0;
                totalDoublePrice = nightsCount * 65.0;
                totalSuitePrice = nightsCount * 75.0;
                if (nightsCount > 7 && month.equals("October"))
                {
                    double currentStudioPrice = 50.0 * 0.95;
                    nightsCount--;
                    totalStudioPrice = nightsCount * currentStudioPrice;
                }
                else if (nightsCount > 7)
                {
                    totalStudioPrice = nightsCount * 50.0 * 0.95;
                }
                break;
            case "June":
            case "September":
                totalDoublePrice = nightsCount * 72.0;
                totalSuitePrice = nightsCount * 82.0;

                if (nightsCount > 14)
                {
                    totalDoublePrice = nightsCount * 72.0 * 0.90;
                }
                if (nightsCount > 7 && month.equals("September"))
                {
                    nightsCount--;
                }

                totalStudioPrice = nightsCount * 60.0;
                break;
            case "July":
            case "August":
            case "December":
                totalStudioPrice = nightsCount * 68.0;
                totalDoublePrice = nightsCount * 77.0;
                totalSuitePrice = nightsCount * 89.0;

                if (nightsCount > 14)
                {
                    totalSuitePrice = nightsCount * 89.0 * 0.85;
                }
                break;
        }

        System.out.println(String.format("Studio: %.2f lv.", totalStudioPrice));
        System.out.println(String.format("Double: %.2f lv.", totalDoublePrice));
        System.out.println(String.format("Suite: %.2f lv.", totalSuitePrice));
    }
}
