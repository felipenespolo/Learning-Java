package exercicios;
import java.util.Scanner;

public class entradaDeDadosInteiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        System.out.println("Voce digitou o numero: " + x);
        sc.close();
    }
}
