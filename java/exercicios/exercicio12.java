package exercicios;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        int minutos, taxa, excecao;
        Scanner sc = new Scanner(System.in);
        minutos = sc.nextInt();
        sc.close();

        if(minutos <= 100){
            System.out.println("Valor a pagar: R$ 50,00");
        } else {
            excecao = minutos - 100;
            taxa = (excecao*2)+ 50;
            System.out.printf("Valor a pagar: R$ %d", taxa);
        }
    }
}
