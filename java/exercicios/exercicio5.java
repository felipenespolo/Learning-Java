package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int number;
        double horas, valor, salario;

        Scanner sc = new Scanner (System.in);

        number = sc.nextInt();

        horas = sc.nextDouble();
        valor = sc.nextDouble();

        sc.close();

        salario = horas * valor;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY U$ = %.2f", salario);
    }
}
