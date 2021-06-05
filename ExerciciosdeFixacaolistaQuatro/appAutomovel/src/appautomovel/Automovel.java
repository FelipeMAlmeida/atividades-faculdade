package appautomovel;

import java.time.LocalDate;

public class Automovel {

    //Atributos ou variáveis de instância/objeto 
    private String marca, modelo, cor, combustivel;
    private float precoCusto, precoVenda;
    private int ano;

    //Sobrecarga de Construtores
    public Automovel(String marca, String modelo, String cor, String combustivel, float precoCusto, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.precoCusto = precoCusto;
        this.ano = ano;
        quantoCusta();//aciona método para calcular o preço de venda inicial do automóvel
    }

    public Automovel(String marca, String modelo, String cor, String combustivel, float precoCusto) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.precoCusto = precoCusto;
        ano = LocalDate.now().getYear();//captura o ano do sistema operecional naquele momento
        quantoCusta();
    }

    //Métodos de acesso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String dados() {
        return "Dados do automóvel"
                + "\nMarca: " + marca
                + "\nModelo: " + getModelo()
                + "\nCor: " + cor
                + "\nCombustível: " + combustivel
                + "\nAno: " + ano
                + "\nPreço de custo R$" + precoCusto
                + "\nPreço de venda R$" + precoVenda;

    }

    //Sobrecarga de método
    private void quantoCusta() {
        if (combustivel.equalsIgnoreCase("Gasolina")) {
            precoVenda = precoCusto + (precoCusto * 5 / 100);
        } else if (combustivel.equalsIgnoreCase("Álcool")) {
            precoVenda = precoCusto + (precoCusto * 7 / 100);
        } else if (combustivel.equalsIgnoreCase("Diesel")) {
            precoVenda = precoCusto + (precoCusto * 15 / 100);
        } else if (combustivel.equalsIgnoreCase("GNV")) {
            precoVenda = precoCusto + (precoCusto * 3 / 100);
        } else if (combustivel.equalsIgnoreCase("Flex")) {
            precoVenda = precoCusto + (precoCusto * 10 / 100);
        }
    }

    public void quantoCusta(float percentual) {
        precoVenda += precoVenda * percentual / 100;
    }
}
