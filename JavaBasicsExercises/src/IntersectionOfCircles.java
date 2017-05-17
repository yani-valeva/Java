import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfCircles {

    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Circle firstCircleCoordinates = readCircleCoordinates();
        Circle secondCircleCoordinates = readCircleCoordinates();
        double distance = getDistanceBetweenCirclesCenters(firstCircleCoordinates, secondCircleCoordinates);
        boolean isIntersect = isIntersect(firstCircleCoordinates, secondCircleCoordinates, distance);

        printResult(isIntersect);
    }

    public static void printResult(boolean isIntersect) {
        if (isIntersect) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isIntersect(Circle firstCircleCoordinates, Circle secondCircleCoordinates, double distance) {
        boolean isIntersect = false;
        double sumOfRadiuses = firstCircleCoordinates.getRadius() + secondCircleCoordinates.getRadius();

        if (distance <= sumOfRadiuses) {
            isIntersect = true;
        }
        return isIntersect;
    }


    public static double getDistanceBetweenCirclesCenters(Circle firstCircleCoordinates, Circle secondCircleCoordinates) {
        double deltaX = firstCircleCoordinates.getCenter().getX() - secondCircleCoordinates.getCenter().getX();
        double deltaY = firstCircleCoordinates.getCenter().getY() - secondCircleCoordinates.getCenter().getY();
        double distance = Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));

        return distance;
    }

    public static Circle readCircleCoordinates() {

        double[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Point point = new Point();
        point.setX(input[0]);
        point.setY(input[1]);

        Circle circle = new Circle();
        circle.setCenter(point);
        circle.setRadius(input[2]);

        return circle;
    }
}

class Circle {
    private Point center;
    private double radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class Point {
    private double X;
    private double Y;

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
}

