package exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int A,B,C,D, Diferenca;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        sc.close();
        
        Diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + Diferenca);
    }
}
