package passouOuNao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Verificador aluno = new Verificador();

        System.out.println("Enter the name student");
        aluno.name = sc.nextLine();

        System.out.println("Enter the notes");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.printf("FINAL GARDE: %.2f", aluno.finalGrade());
        if(aluno.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.check());
        }else{
            System.out.println(" PASS!");
        }
        sc.close();
    }
}
