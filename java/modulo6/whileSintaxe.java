package modulo6;

import java.util.Scanner;

public class whileSintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        while (x != 0) { //enquanto for digitado um n dif de 0 ele continuara lendo
            soma += x;
            x = sc.nextInt();
        }
        sc.close();
        System.out.println(soma);
    }
}
