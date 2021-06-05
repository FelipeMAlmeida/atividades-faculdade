package aplicacaoimc;

public class Alunos {
    private String nomeAluno;
    private double valorPeso;
    private double valorAltura;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getValorPeso() {
        return valorPeso;
    }

    public void setValorPeso(double valorPeso) {
        this.valorPeso = valorPeso;
    }

    public double getValorAltura() {
        return valorAltura;
    }

    public void setValorAltura(double valorAltura) {
        this.valorAltura = valorAltura;
    }
    
    
    
            
    public double calculoImc(){
        double calculoImc = valorPeso / (valorAltura * valorAltura);
       
    
        
        return calculoImc;
    }
    public String mensagem(){
        String mensagem = String.valueOf(calculoImc());
         if (calculoImc() <= 18.6){
            mensagem = "Abaixo do Peso";
        }
         else if (calculoImc() >= 18.6 && calculoImc() <= 24.9){
            mensagem = "Peso normal";
        }
         else if (calculoImc() >= 24.9 && calculoImc() <= 30){
            mensagem = "Sobre Peso";
        }
         else{
            mensagem = "Obesidade";
        }
        return mensagem;
}
}
