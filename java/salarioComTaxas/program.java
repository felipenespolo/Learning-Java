package salarioComTaxas;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        employee employee = new employee();
        System.out.println("Enter the name employee: ");
        employee.name = sc.nextLine();

        System.out.println("Enter the gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Enter the tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee " + employee);
        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + employee);
        
        sc.close();        
    }
}
