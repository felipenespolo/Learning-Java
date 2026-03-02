package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercico7 {
    public static void main(String[] args) {
        double A, B, C, AreaTrinagulo, AreaCirculo, AreaTrapezio, AreaQuadrado, AreaRetangulo;

        double pi = 3.14159;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        A = sc.nextDouble();
        B  = sc.nextDouble();
        C = sc.nextDouble();

        sc.close();

        AreaTrinagulo = (A * C)/2;
        AreaCirculo = pi * (Math.pow(C, 2));
        AreaTrapezio = ((A + B) * C)/2;
        AreaQuadrado =  Math.pow(B, 2);
        AreaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", AreaTrinagulo);
        System.out.printf("CIRCULO: %.3f%n", AreaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", AreaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", AreaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", AreaRetangulo);

    }
}
