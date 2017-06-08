import java.util.Scanner;

public class IncrementVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int incrementTimes = Integer.parseInt(scanner.nextLine());
        int overFlowTimes = 0;

        int number = 0;

        for (int i = 0; i < incrementTimes; i++)
        {
            number++;

            if (number == 256) {
                number = 0;
            }

            if (number == 0)
            {
                overFlowTimes++;
            }
        }

        System.out.println(number);

        if (overFlowTimes > 0)
        {
            System.out.printf("Overflowed %d times", overFlowTimes);
        }
    }
}
