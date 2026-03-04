package modulo5;

public class condicionalTernaria {
    public static void main(String[] args) {
        /* sintaxe
        (condição) ? valorSeACondiçãoForTrue : valorSeACondiçãoForFalse
        */

        double preco = 34.5;
        double precoFinal;
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        precoFinal = preco - desconto;
        System.out.println(precoFinal);

    }
}
