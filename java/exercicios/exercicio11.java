package exercicios;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        int inicio, fim;
        int duracao;
        Scanner sc = new Scanner(System.in);
        inicio = sc.nextInt();
        fim = sc.nextInt();
        sc.close();

        if(inicio < fim){
            duracao = fim - inicio;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else {
            duracao = 24 - inicio + fim;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }

    }
}