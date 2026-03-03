package modulo5;

import java.util.Scanner;

public class condicionalComposta {
    public static void main(String[] args) {
        int hora;
        Scanner sc = new Scanner(System.in);
        hora = sc.nextInt();
        sc.close();
        if(hora < 12){
            System.out.println("Bom dia!");
        }else {
            System.out.println("Boa tarde");
        }
    }
}
