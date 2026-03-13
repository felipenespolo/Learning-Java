package banco;

public class contaEMovimentacao {
    private int numConta;
    private String nomeTitular;
    private double balanco;

    public contaEMovimentacao(int numConta, String nomeTitular, double depositoInicial){ //o public tem q ser o mesmo do da public class
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.balanco = depositoInicial;
    }

    public contaEMovimentacao(int numConta, String nomeTitular){
        this(numConta, nomeTitular, 0.0);  // chama o construtor completo passando 0.0 como depósito padrão
    }

    public String getName(){
        return nomeTitular;
    }
    public void setName(String nomeTitular){ //quase sempre no set se usa void
        this.nomeTitular = nomeTitular;
    }

    public int getNumAcc(){
        return numConta;
    }
    public void setNumAcc(int numConta){
        this.numConta = numConta;
    }

   public double getBalanco(){
        return balanco;
   }

   public void deposito(double valor){
        balanco += valor;
   }

   public void saque(double valor){
        balanco -= valor + 5.0;
   }

   public String toString(){
        return "Account " + numConta + ", Holder: " + nomeTitular + ", Balance: R$ " + String.format("%.2f", balanco);
}

}
