package exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int x,y, soma;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        sc.close();

        soma = x+y;

        System.out.println("SOMA = " + soma);

    }
}
