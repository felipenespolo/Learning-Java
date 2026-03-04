package exercicios;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        sc.close();
        
        if(numero >= 0){
            System.out.println("POSITIVO");
        } else {
            System.out.println("NEGATIVO");
        }
    }
}
