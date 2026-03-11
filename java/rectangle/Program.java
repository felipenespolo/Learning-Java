package rectangle;

import java.util.Locale;
import java.util.Scanner;
import rectangle.Measure;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Measure rect = new Measure();

        System.out.println("Enter rectangle width and height:");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.Area());
        System.out.printf("PERIMETER = %.2f%n", rect.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.Diagonal());

        sc.close();
    }
}
