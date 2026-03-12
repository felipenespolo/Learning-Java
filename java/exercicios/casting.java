package exercicios;
public class casting {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        double resultado;

        resultado = (double) a/b; //com o double na frente força a entregar o numero double, se nao tivesse ia ser o resultado 2.0, pois a e b sao int

        System.out.println(resultado);
    }
}
