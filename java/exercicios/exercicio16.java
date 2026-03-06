package exercicios;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int contIn = 0;
        int contOut = 0;

        for(int i = 0; i<N; i++){
            int x = sc.nextInt();
            if(x>=10 && x<=20 ){
                contIn++;
            }else{
                contOut++;
            }
        }
        System.out.println(contIn + " in");
        System.out.println(contOut + " out");
        sc.close();
    }
}
