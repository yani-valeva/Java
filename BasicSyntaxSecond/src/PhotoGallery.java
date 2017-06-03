import java.text.DecimalFormat;
import java.util.Scanner;

public class PhotoGallery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int photoNumber = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        double photoSize = Double.parseDouble(scanner.nextLine());
        int photoWidth = Integer.parseInt(scanner.nextLine());
        int photoHeight = Integer.parseInt(scanner.nextLine());

        System.out.printf("Name: DSC_%04d.jpg%n", photoNumber);
        System.out.printf("Date Taken: %02d/%02d/%d %02d:%02d%n", day, month, year, hours, minutes);

        DecimalFormat df = new DecimalFormat("0.#");

        if (photoSize < 1000)
        {
            System.out.printf("Size: %sB%n", df.format(photoSize));
        }
        else if (photoSize < 1000000)
        {
            photoSize /= 1000;
            System.out.printf("Size: %sKB%n",  df.format(photoSize));
        }
        else
        {
            photoSize /= 1000000;
            System.out.printf("Size: %sMB%n",  df.format(photoSize));
        }

        String orientation = "";

        if (photoWidth > photoHeight)
        {
            orientation = "landscape";
        }
        else if (photoWidth < photoHeight)
        {
            orientation = "portrait";
        }
        else
        {
            orientation = "square";
        }

        System.out.printf("Resolution: %dx%d (%s)", photoWidth, photoHeight, orientation);
    }
}
