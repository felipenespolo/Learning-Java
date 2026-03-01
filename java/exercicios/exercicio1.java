package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double areaX;
        double areaY;
        double precoDoMetro;
        double areaTotal;
        double precoTotal;

        Scanner sc = new Scanner(System.in);

        areaX = sc.nextDouble();
        areaY = sc.nextDouble();
        precoDoMetro = sc.nextDouble();

        sc.close();

        areaTotal = areaX * areaY;

        precoTotal = areaTotal * precoDoMetro;

        System.out.printf("Area = %.2f%n", areaTotal);
        System.out.printf("Preco = %.2f", precoTotal);
    }
}
