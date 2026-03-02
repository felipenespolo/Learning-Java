package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double pi = 3.14159;
        double raio, volume;

        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();
        sc.close();

        volume = (4/3.0) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
