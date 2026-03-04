package exercicios;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        sc.close();

        if(numero%2==0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}
