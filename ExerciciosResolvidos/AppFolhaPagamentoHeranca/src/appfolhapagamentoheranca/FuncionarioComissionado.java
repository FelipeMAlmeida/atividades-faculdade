package appfolhapagamentoheranca;

import java.text.DecimalFormat;

public class FuncionarioComissionado extends Funcionario {

    //Atributos específicos da classe FuncionarioComissionado, os demais são herdados
    private double totalDeVenda;
    private double percentualDeComissao;

    public FuncionarioComissionado(String nome, String carteiraDeTrabalho, double salarioBase, double vendas, double percentual) {
        super(nome, carteiraDeTrabalho, salarioBase);//primeira instrução do construtor da classe filha
        this.totalDeVenda = vendas;
        this.percentualDeComissao = percentual;
    }

    public FuncionarioComissionado(String nome, String carteiraDeTrabalho, double salarioBase) {
        super(nome, carteiraDeTrabalho, salarioBase);
    }

    public double getTotalDeVenda() {
        return totalDeVenda;
    }

    public void setTotalDeVenda(double totalDeVenda) {
        this.totalDeVenda = totalDeVenda;
    }

    public double getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(double percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }

    public double calculaSalarioTotal() {
        return getSalarioBase() + (totalDeVenda * percentualDeComissao / 100);
        //return super.salarioBase + (totalDeVenda * percentualDeComissao/100);//super. é a forma que chamamos o atribudo da classe herdada 
    }

    @Override
    public String dadosFuncionario() {
        DecimalFormat mascara = new DecimalFormat("#,##0.00");
        return super.dadosFuncionario() + "\nSalário final R$ " + mascara.format(calculaSalarioTotal());
    }

}
