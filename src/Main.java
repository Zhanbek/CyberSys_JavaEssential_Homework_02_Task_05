import model.MyArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть радіус кола: ");
        double radius = scanner.nextDouble();
        scanner.close();

        double area = MyArea.areaOfCircle(radius);
        System.out.println("Площа кола радіуса " + radius + " дорівнює " + Double.toString(area));
    }
}