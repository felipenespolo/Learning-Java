package exercicios;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i<N; i++){
            double p = sc.nextDouble();
            double q = sc.nextDouble();
            double r = sc.nextDouble();
            
            double media = (p*2 + q*3 + r*5)/10;
            System.out.printf("%.2f", media);

        }
        sc.close();
    }
}
