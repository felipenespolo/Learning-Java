package modulo6;

import java.util.Scanner;

public class forSintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        for(int i=0; i<x; i++){
            int N = sc.nextInt();
            soma += N;
        }
        System.out.println(soma);
        sc.close();
    }
}
