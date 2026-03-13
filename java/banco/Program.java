package banco;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int numConta = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();

        System.out.println("Enter initial deposit value (y/n)?");
        char initialDeposit = sc.next().charAt(0);

        contaEMovimentacao acc;

        if(initialDeposit == 'y'){
            acc = new contaEMovimentacao(numConta, nomeTitular, sc.nextDouble());
        }else{
            acc = new contaEMovimentacao(numConta, nomeTitular);
        }
    
        System.out.println("Account data: ");
        System.out.println(acc);
        
        System.out.println("Enter a deposit value: ");
        double deposito = sc.nextDouble();
        acc.deposito(deposito);
        System.out.println("Update account data: ");
        System.out.println(acc);

        System.out.println("Enter a withdraw value: ");
        double saque = sc.nextDouble();
        acc.saque(saque);
        System.out.println("Update account data: ");
        System.out.println(acc);

        sc.close();
    }
}
