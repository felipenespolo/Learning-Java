package conversorDeDolar;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conversor conv = new Conversor();
        System.out.println("What is the dollar price?");
        conv.dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        conv.valorEmDollar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", conv.CurrencyConverter());

        sc.close();
    }
}
