package appatividade2;

public class Imovel {

    protected String nome;
    protected String endereco;
    protected boolean aluguelVenda;
    protected boolean casaApt;
    protected double preco;
    protected double qntMetros;

    public Imovel(String nome, String endereco, boolean aluguelVenda, boolean casaApt, double preco, double qntMetros) {
        this.nome = nome;
        this.endereco = endereco;
        this.aluguelVenda = aluguelVenda;
        this.casaApt = casaApt;
        this.preco = preco;
        this.qntMetros = qntMetros;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isAluguelVenda() {
        return aluguelVenda;
    }

    public void setAluguelVenda(boolean aluguelVenda) {
        this.aluguelVenda = aluguelVenda;
    }

    public boolean isCasaApt() {
        return casaApt;
    }

    public void setCasaApt(boolean casaApt) {
        this.casaApt = casaApt;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQntMetros() {
        return qntMetros;
    }

    public void setQntMetros(double qntMetros) {
        this.qntMetros = qntMetros;
    }


    public String casaApt() {
        if (casaApt) {
            return "Casa";
        } else {
            return "Apartamento";
        }
    }

    public String aluguelVenda(){
        if(aluguelVenda){
            return "Venda";
        }else{
            return "Aluguel";
        }
    }

    public String dados() {
        return "Imóvel do tipo " + casaApt()
                + "\nProprietário: " + nome
                + "\nEndereço: " + endereco
                + "\nTamanho: " + qntMetros + " m2"
                +"\nTipo de negócio: " + aluguelVenda()
                + "\nValor: " + preco;
    }
}
