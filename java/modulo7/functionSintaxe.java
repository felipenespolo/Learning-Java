package modulo7;

import java.util.Scanner;

public class functionSintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int higher = max(A, B, C);
        showResult(higher);
        sc.close();
    }
    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x > z){
            aux = x;
        }else if(y > z){
            aux = y;
        }else{
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}
