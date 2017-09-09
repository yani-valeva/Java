import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarship {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double income = Double.parseDouble(reader.readLine());
        double averageGrades = Double.parseDouble(reader.readLine());
        double minSalary = Double.parseDouble(reader.readLine());
        double socialScholarship = 0.35 * minSalary;
        double scholarship = averageGrades * 25;
        boolean hasSocialScholarship = false;
        boolean hasScholarship = false;

        if(income < minSalary && averageGrades > 4.5) {
            hasSocialScholarship = true;
        }
        if (averageGrades >= 5.5) {
            hasScholarship = true;
        }
        if (!hasSocialScholarship && !hasScholarship) {
            System.out.println("You cannot get a scholarship!");
            return;
        }
        if (hasSocialScholarship && hasScholarship && socialScholarship > scholarship) {
            double result = Math.floor(socialScholarship);
            System.out.println(String.format("You get a Social scholarship %.0f BGN", result));
            return;
        }
        if (hasSocialScholarship && hasScholarship && socialScholarship <= scholarship) {
            double result = Math.floor(scholarship);
            System.out.println(String.format("You get a scholarship for excellent results %.0f BGN", result));
            return;
        }
        if (hasSocialScholarship) {
            double result = Math.floor(socialScholarship);
            System.out.println(String.format("You get a Social scholarship %.0f BGN", result));
            return;
        }
        if (hasScholarship) {
            double result = Math.floor(scholarship);
            System.out.println(String.format("You get a scholarship for excellent results %.0f BGN", result));
        }
    }
}
