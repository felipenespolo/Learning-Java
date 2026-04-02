package exercicios;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][] matriz = new int[m][n];

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int valor = sc.nextInt();

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
               if (matriz[i][j] == valor){
                System.out.println("Position " + i + "," + j + ":");
                if (j - 1 >= 0)   System.out.println("Left: "  + matriz[i][j-1]);
                if (j + 1 < n)    System.out.println("Right: " + matriz[i][j+1]);
                if (i - 1 >= 0)   System.out.println("Up: "    + matriz[i-1][j]);
                if (i + 1 < m)    System.out.println("Down: "  + matriz[i+1][j]);
               }
            }
        }
    }
}
