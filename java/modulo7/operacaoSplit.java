package modulo7;

public class operacaoSplit {
    public static void main(String[] args) {
        String S = "potato apple lemon";
        String[] vet = S.split(" ");

        System.out.println(vet[0]);
        System.out.println(vet[1]);
        System.out.println(vet[2]);
    }
}
