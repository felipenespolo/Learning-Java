package exerciciosFaculdade.Biblioteca;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Livro[] livro = new Livro[2];
        Cliente[] cliente = new Cliente[2];
      
        for(int i= 0; i<livro.length; i++){
            System.out.println("Livro " + (i+1));

            System.out.print("Titulo: ");
            String titulo = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Ano de Publicação: ");
            int anoPublicacao = sc.nextInt();

            System.out.print("Quantidade de Paginas: ");
            int qtPaginas = sc.nextInt();

            System.out.print("Preco: ");
            double price = sc.nextDouble();
            sc.nextLine();

            livro[i] = new Livro(titulo, autor, anoPublicacao, qtPaginas, price);
        }

        sc.nextLine();

        for (int i = 0; i < cliente.length; i++) {
            System.out.println("Cliente " + (i+1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("E-mail: ");
            String email = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            cliente[i] = new Cliente(nome, idade, sexo, email, senha);
        }
        
        System.out.println("============= Preço por Pagina: ============");
        for (int i = 0; i < livro.length; i++) {
            System.out.printf("Livro: %d: R$: %.2f preço por pagina", (i+1), livro[i].calcularValorPorPagina());
            System.out.println("=====================================");
        }

        System.out.println();

        System.out.println("========== Livros: ===============");
        for (int i = 0; i < livro.length; i++) {
            livro[i].imprimeInfo();
            System.out.println("============================");
        }

        System.out.println();

        System.out.println("=========== Clientes ===================");
        for (int i = 0; i < cliente.length; i++) {
            cliente[i].imprimeInfo();
            System.out.println("=================================");
        }
        sc.close();
    }
}
