import java.util.Scanner;

public class TriangleFormations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSide = Integer.parseInt(scanner.nextLine());
        int secondSide = Integer.parseInt(scanner.nextLine());
        int thirdSide = Integer.parseInt(scanner.nextLine());

        boolean isValid = firstSide + secondSide > thirdSide &&
                secondSide + thirdSide > firstSide &&
                thirdSide + firstSide > secondSide;

        if (!isValid)
        {
            System.out.println("Invalid Triangle.");
            return;
        }

        System.out.println("Triangle is valid.");
        PrintResult(firstSide, secondSide, thirdSide);
    }

    private static void PrintResult(int firstSide, int secondSide, int thirdSide)
    {
        if (Math.pow(firstSide, 2) + Math.pow(secondSide, 2) == Math.pow(thirdSide, 2))
        {
            System.out.println("Triangle has a right angle between sides a and b");
            return;
        }
        else if (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2) == Math.pow(firstSide, 2))
        {
            System.out.println("Triangle has a right angle between sides b and c");
            return;
        }
        else if (Math.pow(thirdSide, 2) + Math.pow(firstSide, 2) == Math.pow(secondSide, 2))
        {
            System.out.println("Triangle has a right angle between sides a and c");
            return;
        }

        System.out.println("Triangle has no right angles");
    }
}
