package exercicios;
import java.util.Scanner;

public class EntradaDeDadosFrases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3; //next line permite escrever mais coisas na string, ja o next so permite uma palavra

        x = sc.nextInt();
        sc.next(); //precisa quando se usa o nextLine usar um sc.next() vazio, pois ao apertar o enter a string vazia vai ser atribuida na func abaxio, entao fazendo um sc vazio essa string do espaço vai para ela sem afetar as proximas
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        
        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
