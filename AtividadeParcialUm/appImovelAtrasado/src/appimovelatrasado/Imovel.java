package appimovelatrasado;

import java.text.DecimalFormat;

public class Imovel {

    //Atributos
    private String identificacao;
    private String nome;
    private String sobrenome;
    private String cpf;
    private double imposto;
    private int mesesAtraso;

    //Construtor
    public Imovel(String identificacao, String nome, String sobrenome, String cpf, double imposto, int mesesAtraso) {
        this.identificacao = identificacao;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.imposto = imposto;
        this.mesesAtraso = mesesAtraso;
    }

    //Métodos de acesso 
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public int getMesesAstraso() {
        return mesesAtraso;
    }

    public void setMesesAstraso(int mesesAstraso) {
        this.mesesAtraso = mesesAstraso;
    }

//      Método que eu fiz porém não seria a melhor forma de ser feito    
//    public double atraso() {
//        double valor = imposto * 2 / 100;
//        int i = 1;
//        while (i < mesesAtraso) {
//            valor += valor + valor * 2 / 100;
//            i++;
//        }
//        return valor;
//    }
    public double calculaMulta() {
        int i = 1;
        double multa = 0;
        while (i <= mesesAtraso) {
            multa += (imposto + multa) * 0.02;
            i++;
        }
        return multa;
    }

    //Método que uni as informações para serem apresentadas
    public String informacoes() {
        DecimalFormat mascara = new DecimalFormat("#,##0.00"); //Máscara para os números decimais
        return "Informações:"
                + "\nIdentificação do Imóvel: " + identificacao
                + "\nNome do proprietário: " + nome + " " + sobrenome
                + "\nCPF do proprietário: " + cpf
                + "\nValor do imposto R$" + imposto
                + "\nMeses em atraso: " + mesesAtraso
                + "\nMulta a ser paga R$" + mascara.format(calculaMulta());
    }
}
