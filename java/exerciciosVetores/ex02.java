package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double soma=0.0, media=0.0;
        double[] vect = new double[n];

        for(int i=0; i<vect.length; i++){
            vect[i] = sc.nextDouble();
        }
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }

        media = soma/vect.length;

        System.out.print("Valores: ");
        for(int i=0; i<n; i++){
            System.out.printf("%.1f  ", vect[i]);
        }
        System.out.printf("%nSoma: %.2f%n", soma);
        System.out.printf("Media: %.2f", media);


    }
}
