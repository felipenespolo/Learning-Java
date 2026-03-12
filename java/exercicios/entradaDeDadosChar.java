package exercicios;
import java.util.Scanner;

public class entradaDeDadosChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x;
        x = sc.next().charAt(0); //funcão charAt(0) pega a primeira letra da string 
        System.out.println(x);
    }
}
