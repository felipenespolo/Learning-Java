package modulo10;

import java.util.Locale;
import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int rep = sc.nextInt();
        double[] vect = new double[rep];

        for(int i = 0; i<rep; i++){
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i=0; i<rep; i++){
            soma += vect[i];
        }

        double media = soma / rep;
        System.out.printf("Media: %.2f",media);
        sc.close();
    }

}
