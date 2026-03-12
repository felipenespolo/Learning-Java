package conversorDeDolar;

public class Conversor {
    public double dollarPrice;
    public double valorEmDollar;

    public double Iof(){
        return (valorEmDollar * dollarPrice)*0.06;
    }

    public double CurrencyConverter(){
        return (valorEmDollar * dollarPrice) + Iof();
    }
}
