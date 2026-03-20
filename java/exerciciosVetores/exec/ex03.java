package exerciciosVetores.exec;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] vect = new int[n];
        int cont = 0;
        for(int i=0; i<n; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Numeros pares:");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0){
                System.out.println(vect[i]);
                cont++;
            }
        }
        System.out.println("Quantidade de pares " + cont);
        sc.close();
    }
}
