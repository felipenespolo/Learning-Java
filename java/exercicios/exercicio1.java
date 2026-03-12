package exercicios;
import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {
        String Product1 = "Computer";
        String Product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;
        
        /* printf
            %f = ponto flutuante
            %d = inteiro
            %s = texto
            %n = quebra linha
        */

        System.out.println("Products:");
        System.out.printf("%s, which price is R$ %.2f%n", Product1, price1);
        System.out.printf("%s, which price is R$ %.2f%n", Product2, price2);
        System.out.println();
        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
        System.out.println();
        System.out.printf("Measure with eigth decimal places: %f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US deciaml pointer: %.3f%n", measure);
    }
}
