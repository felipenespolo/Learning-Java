package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int Km;
        double Combustivel, Consumo;

        Scanner sc = new Scanner(System.in);
        Km = sc.nextInt();
        Combustivel = sc.nextDouble();
        sc.close();

        Consumo = Km/Combustivel;
        

        System.out.printf("%.3f km/l%n", Consumo);
    } 
}