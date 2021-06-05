package rendimento;

public class Banco {
    private double valorDepositado;
    private double valorJuros;

    public double getValorDepositado() {
        return valorDepositado;
    }

    public void setValorDepositado(double valorDepositado) {
        this.valorDepositado = valorDepositado;
    }

    public double getValorJuros() {
        return valorJuros;
    }

    public void setValorJuros(double valorJuros) {
        this.valorJuros = valorJuros;
    }
    
     public double calcularJuros (){
        double calcularJuros = valorDepositado * valorJuros / 100;
        return calcularJuros;
    }
     public double calcularTotal (){
        double calcularTotal = calcularJuros() + valorDepositado;
        return calcularTotal;
    }
    
}
