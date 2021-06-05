package salarioliquido;
//Faça um aplicativo para efetuar o cálculo do salário líquido de um professor. Utilize os seguintes 
//dados: valor da hora aula, quantidade de horas ministradas no mês e percentual de desconto do 
//INSS.

public class Professor { 
    //Atributos
        private float valorHora;
        private int qtdeHoras;    
        private float percentualInss;
       
    //Métodos de acesso get (retornam o valor do atributo)
    public float getValorHora(){
        return valorHora;
    }
    //Métodos de acesso set (associa o valor recebido como parâmetro, ao atributo)
    public void setValorHora(float valor){
        valorHora = valor;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public float getPercentualInss() {
        return percentualInss;
    }

    public void setPercentualInss(float percentualInss) {
        this.percentualInss = percentualInss;
    }
    
    //Métodos
    public float salarioBruto(){
        float salarioBruto = valorHora * qtdeHoras;
        return salarioBruto;
    }
    public float inss(){
        float inss = salarioBruto() * percentualInss / 100;
        return inss;
    }
    public float salarioLiquido(){
        float salLiquido = salarioBruto() - inss();
        return salLiquido;
    }
}