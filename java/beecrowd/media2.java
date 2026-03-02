package beecrowd;

import java.util.Locale;
import java.util.Scanner;
public class media2 {
    public static void main(String[] args) {
        
        double A, B, C, NotaA, NotaB, NotaC, Media;

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        sc.close();

        NotaA = A * 2;
        NotaB = B * 3;
        NotaC = C * 5;

        Media = (NotaA + NotaB + NotaC)/10.0;

        System.out.printf("MEDIA = %.1f%n", Media);
    }
}
