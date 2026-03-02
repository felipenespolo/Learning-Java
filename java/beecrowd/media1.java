package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class media1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double A, B, NotaA, NotaB,Media;

        Scanner sc = new Scanner(System.in);

        A = sc.nextDouble();
        B = sc.nextDouble();

        sc.close();

        NotaA = A * 3.5;
        NotaB = B * 7.5;

        Media = (NotaA + NotaB)/11;

        System.out.printf("MEDIA = %.5f%n", Media);
    }
}