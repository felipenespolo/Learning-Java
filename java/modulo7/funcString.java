package modulo7;

public class funcString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String S1 = original.toLowerCase();
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + S1 + "-");

        String S2 = original.toUpperCase();
        System.out.println("toUpperCase: -" + S2 + "-");

        String S3 = original.trim();
        System.out.println("trim: -" + S3 + "-"); //remove os espaços iniciais e finais

        String S4 = original.substring(2); //gera uma "nova" string a partir do N passado entre parenteses 
        System.out.println("substring (2): -" + S4 + "-"); 

        String S5 = original.substring(2, 9); //cria uma nova string mas agora recorta entre os N 2 e 9
        System.out.println("substring restrita(2, 9) -" + S5 + "-");

        String S6 = original.replace('a', 'x'); //troca todas as letras passadas no parametro pela letra definida, no caso troca a por x
        System.out.println("Replace (a,x): -" + S6 + "-");

        String S7 = original.replace("abc", "xy"); //troca "sequencias" tambem
        System.out.println("Replace substring (abc, xy): -" + S7 + "-" );

        System.out.println();

        int i = original.indexOf("bc"); //procura a priemira posição do parametro passado nos ()
        System.out.println(i);

        System.out.println();

        int j = original.lastIndexOf("bc"); //procura a ULTIMA posição do paratro nos ()
        System.out.println(j);
    }
    

}
