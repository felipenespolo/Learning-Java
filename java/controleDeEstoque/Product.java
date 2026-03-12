package controleDeEstoque;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity){ //sempre vai aqui entre os  metodos e as variaveis
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
