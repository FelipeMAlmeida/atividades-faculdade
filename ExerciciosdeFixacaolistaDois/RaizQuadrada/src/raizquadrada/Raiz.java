package raizquadrada;
//Faça um aplicativo que receba um número inteiro, calcule e exiba a raiz quadrada desse número.
public class Raiz {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public double calcularRaiz(){
        double calcularRaiz = Math.sqrt(valor);
        return calcularRaiz;
    }
}
