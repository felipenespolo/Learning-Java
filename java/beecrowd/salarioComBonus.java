package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class salarioComBonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String Nome;
        double SalarioFixo, ValorVendasMes, ValorComBonus;

        Scanner sc = new Scanner(System.in);

        Nome = sc.next();

        SalarioFixo = sc.nextDouble();
        ValorVendasMes = sc.nextDouble();

        sc.close();
        
        ValorComBonus = (ValorVendasMes * 0.15) + SalarioFixo;

        System.out.printf("TOTAL = R$ %.2f%n", ValorComBonus);
    }
}