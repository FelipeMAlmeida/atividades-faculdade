package appimoveis;

/*
Em certo município, vários proprietários de imóveis estão em atraso com o pagamento do imposto predial. Para 
cada imóvel deverão ser informados os seguintes dados: Identificação (String), valor do imposto (double) e número 
de meses em atraso (int). Será cobrado 2% por mês em atraso (acumulativo).
Como saída deverá ser mostrado: identificação do imóvel, valor do imposto, meses em atraso e multa a ser paga.
Implemente a classe Imovel com seus atributos e métodos.

 */
public class Imovel {

    private String identificacao;
    private double imposto;
    private int mesesAtraso;

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public int getMesesAtraso() {
        return mesesAtraso;
    }

    public void setMesesAtraso(int mesesAtraso) {
        this.mesesAtraso = mesesAtraso;
    }

    public String valorAtraso() {
        String resposta = "";
        double valorImposto=0;
        int i = 0;
        while (i < mesesAtraso) {
            valorImposto += imposto * 2 / 100;
            i++;
        }
        return resposta = "o nome do imóvel é: " + identificacao + "\n" + "O valor do imposto é: " + imposto + "\n" +
                "O número de meses atrasados é: " + mesesAtraso + "\n" + "A multa que deve ser paga é: " + valorImposto;
    }
}
