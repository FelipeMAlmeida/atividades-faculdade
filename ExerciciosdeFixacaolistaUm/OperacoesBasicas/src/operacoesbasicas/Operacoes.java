package operacoesbasicas;

public class Operacoes {
    private double valorUm;
    private double valorDois;

    public double getValorUm() {
        return valorUm;
    }

    public void setValorUm(double valorUm) {
        this.valorUm = valorUm;
    }

    public double getValorDois() {
        return valorDois;
    }

    public void setValorDois(double valorDois) {
        this.valorDois = valorDois;
    }
    
    
     public double calcularSoma (){
        double calcularSoma =valorUm + valorDois;
        return calcularSoma;
    }
      public double calcularSubtracao (){
        double calcularSubtracao =valorUm - valorDois;
        return calcularSubtracao;
    }
       public double calcularProduto (){
        double calcularProduto =valorUm * valorDois;
        return calcularProduto;
    }
        public double calcularDivisao (){
        double calcularDivisao =valorUm / valorDois;
        return calcularDivisao;
    }
}
