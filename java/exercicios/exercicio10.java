package exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        int X, Y;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();

        if(X%Y==0 || Y%X==0){
            System.out.println("SÃO MULTIPLOS");
        } else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }
    }
}
