package exerciciosVetores.alturas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0.0, mediaAltura = 0.0, percMenores = 0.0;
        int menores = 0;
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da pessoa %d: %n", i+1);
            sc.nextLine();
            String name = sc.nextLine();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(name, idade, altura);
        }

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getAltura();
        }

        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getIdade() < 16){
                menores++;

            }
        }
        mediaAltura = soma / n;
        percMenores = ((double)menores/n)*100.0;

        System.out.printf("Media das Altura: %.2f%n", mediaAltura);
        System.out.printf("Pessoas menores de 16 anos: %.2f%n", percMenores);

        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getIdade() < 16){
                System.out.printf("%s%n", vect[i].getName());
            }
        }
        sc.close();
    }
}
