package exerciciosVetores.exec;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] vect = new int[n];
        for(int i=0; i<n; i++){
            vect[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(vect[i] < 0){
                System.out.printf("%d\n", vect[i]);
            }
        }
        sc.close();
    }
}
