import java.util.Locale;
import java.util.Scanner;

public class entradaDeDadosDouble {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //precisa pois se no terminal digitar 4.5 ele da erro pois o SO do pc esta em PTBR é o separador de decimais é a virgula

        Scanner sc = new Scanner(System.in);
        double x;
        x = sc.nextDouble();
        System.out.println("Voce digitou: " + x);
        sc.close();
    }
}
