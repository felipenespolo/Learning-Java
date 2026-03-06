package exercicios;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i<N; i++){
            double X = sc.nextDouble();
            double Y = sc.nextDouble();
            double div;
            if(Y == 0){
                System.out.println("Divisão Impossivel!");
            }else{
                div = X/Y;
                System.out.println(div);
            }
        }
        sc.close();
    }
}
