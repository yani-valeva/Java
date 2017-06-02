import java.util.Scanner;

public class FiveDifferentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (b - a < 4)
        {
            System.out.println("No");
        }
        else
        {
            for (int n1 = a; n1 <= b - 4; n1++)
            {
                for (int n2 = n1 + 1; n2 <= b - 3; n2++)
                {
                    for (int n3 = n2 + 1; n3 <= b - 2; n3++)
                    {
                        for (int n4 = n3 + 1; n4 <= b - 1; n4++)
                        {
                            for (int n5 = n4 + 1; n5 <= b; n5++)
                            {
                                System.out.println(String.format("%d %d %d %d %d", n1, n2, n3, n4, n5));
                            }
                        }
                    }
                }
            }
        }
    }
}
