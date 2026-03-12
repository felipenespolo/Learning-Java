package exercicios;
import java.util.Locale;

public class saidaDeDados {
    public static void main(String[] args) {
        System.out.println("Modo padrao de saida Java");

        int y = 32;
        double x = 10.889123;
        double casaDecimal = 8.13987;

        System.out.println(y); //printa o 32 da variavel y

        System.out.println(x); //printa o 10.889123 da variavel x

        System.out.printf("%.3f%n", casaDecimal); //usase printf (f de formatar) para delimitar a casas decimais, entre os %, o n significa quebra de linha, depois entre () apos a virgula a variavel que é pra modificar para se fazer as casa a sintaxe é %.2f o outro % se refere a quebra de linha, que pode se substituido pela barra invertida \, fazendo \n

        Locale.setDefault(Locale.US); //serve para mudar o padrao de impressão do decimal, no brasil é a virgula, no USA vira o ponto
        System.out.printf("%.3f%n", casaDecimal); 

        //concatenação
        int j = 5000;
        System.out.println("Resultado = " + j + " Metros");

        double q = 5000.399;
        System.out.printf("Resultado = %.2f metros%n", q); //aqui precisa ter o % para quebrar linha

        /* printf
            %f = ponto flutuante
            %d = inteiro
            %s = texto
            %n = quebra linha
        */
        String nome = "Brenda";
        int idade = 21;
        double renda = 4000.00;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        
        //as variaveis precisam ser na ordem em que foram postas na hora de printar 

    }
}
