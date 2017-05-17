import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double lateralWall = x * y;
        double totalLateralWalls = (2 * lateralWall) - (2 * 2.25);
        double backWall = x * x;
        double frontAndBackWall = (2 * backWall) - 2.4;
        double totalHouseArea = totalLateralWalls + frontAndBackWall;
        double greenPaint = totalHouseArea / 3.4;
        double roofRectangles = 2 * (x * y);
        double roofTriangles = 2 * (x * h / 2);
        double totalRoofArea = roofRectangles + roofTriangles;
        double redPaint = totalRoofArea / 4.3;

        System.out.println(String.format("%.2f", greenPaint));
        System.out.println(String.format("%.2f", redPaint));
    }
}
