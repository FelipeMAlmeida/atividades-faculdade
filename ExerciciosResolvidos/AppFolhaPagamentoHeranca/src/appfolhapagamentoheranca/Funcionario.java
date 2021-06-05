package appfolhapagamentoheranca;

import java.text.DecimalFormat;

public class Funcionario {

    //Atributos
    //protected String nome; protected: permite acesso às classes filhas, mas proíbe a qualquer outro acesso externo.
    //private String nome; private: proíbe qualquer acesso externo à própria classe, inclusive das classes filhas.
    private String nome;
    private String carteiraDeTrabalho;
    private double salarioBase;

    //Construtor
    public Funcionario(String nome, String carteiraDeTrabalho, double salarioBase) {
        this.nome = nome;
        this.carteiraDeTrabalho = carteiraDeTrabalho;
        this.salarioBase = salarioBase;
    }

    //Métodos de Acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String dadosFuncionario() {
        DecimalFormat mascara = new DecimalFormat("#,##0.00");
        return "Demonstrativo de Pagamento"
                + "\nFuncionário: " + nome
                + "\nCarteira de Trabalho N° " + carteiraDeTrabalho
                + "\nSalário Base R$ " + mascara.format(salarioBase);
    }
}
