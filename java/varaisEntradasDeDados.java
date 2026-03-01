import java.util.Scanner;

public class varaisEntradasDeDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String X;
        int Y;
        double Z;

        X = sc.next();
        Y = sc.nextInt();
        Z = sc.nextDouble();

        System.out.println(X);
        System.out.println(Y);
        System.out.println(Z);

        sc.close();
    }
}
