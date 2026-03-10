package modulo8POO.productEntities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; //this fala do atributo(o int declarado) n aqui da funct
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
}
