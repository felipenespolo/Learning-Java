package modulo11Listas.Exercicio;

public class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    double incraseSalary(double porcentagem){
        return salary += salary * porcentagem / 100.00;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }  

    public void setSalary(double salary) {
        this.salary = salary;
    }   
    
}
