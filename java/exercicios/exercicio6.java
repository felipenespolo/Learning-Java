package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int codPeca1, codPeca2, numPecas1, numPecas2;
        double valorPeca1, valorPeca2, valorTotal;

        Scanner sc = new Scanner (System.in);

        codPeca1 = sc.nextInt();
        numPecas1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        codPeca2 = sc.nextInt();
        numPecas2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        sc.close();

        valorTotal = (numPecas1 * valorPeca1) + (numPecas2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
    }
}
