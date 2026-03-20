package exerciciosVetores.pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Locacao[] vect = new Locacao[10];

        System.out.println("How many rooms will be rented? " + n);

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i+1));

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            vect[room] = new Locacao(name, email, room);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < vect.length ; i++) {
            if(vect[i] != null){
                System.out.println(vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
            }
        }
        sc.close();
    }
}
