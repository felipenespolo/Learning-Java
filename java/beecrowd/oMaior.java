package beecrowd;

import java.util.Scanner;

public class oMaior {
    public static void main(String[] args) {
        int A, B, C, MaiorAB, oMaior;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        sc.close();

        MaiorAB = (A + B +Math.abs(A - B))/2;
        oMaior = (C + MaiorAB + Math.abs(C - MaiorAB))/2;

        System.out.println(oMaior+" eh o maior");
    }
}
