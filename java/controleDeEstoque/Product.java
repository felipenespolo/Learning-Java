package controleDeEstoque;

public class Product {
    private String name; //private = encapsulamento, não é possivel ter acesso a ela
    private double price;
    private int quantity;

    public Product(String name, double price, double quantity){//sempre vai aqui entre os  metodos e as variaveis
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price){ //sobrecarga versão da mesma operação com parametros diferentes
        this.name = name;
        this.price = price;
    }

    public String getName(){ //sem o metodo get é impossivel fazer a leitura de um variavel Private
        return name;
    }

    public void setName(String name){ //pega esse metedo para fazer o uso da string private (this.name é o name private)
        this.name = name; 
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; //this fala do atributo(o int declarado) n aqui da funct
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: " + String.format("%.2f", totalValueInStock()); 
    }
}
