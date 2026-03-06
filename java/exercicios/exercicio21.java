package exercicios;

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i<=N; i++){
            double quadrado;
            double cubo;
            quadrado = Math.pow(i, 2);
            cubo = Math.pow(i, 3);
            System.out.printf("%d %.1f %.1f%n", i, quadrado, cubo);
            //System.out.println();
        }
        sc.close();
    }
}
