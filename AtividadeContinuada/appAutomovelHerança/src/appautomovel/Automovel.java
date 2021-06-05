/**
 * Implemente a classe Automovel, para representar e tratar informação relativa a um automóvel.
 * Esta classe deve incluir atributos como a marca, modelo, ano, cor, combustível e preço de custo.
 * a. Implemente o(s) construtor(es) e métodos para visualizar e alterar o valor dos atributos.
 * Implemente um método String toString() para retornar um texto com todas as informações
 * do automóvel.
 * b. Implemente um método double quantoCusta() para calcular o preço de venda do veículo,
 * calculado sobre o preço de custo e de acordo com o tipo de combustível, conforme a tabela
 * abaixo.
 * COMBUSTÍVEL ACRÉSCIMO
 * GASOLINA 7.5%
 * ALCOOL 10%
 * DIESEL 17.5%
 * GNV 23%
 * FLEX 15%
 */
package appautomovel;

import java.time.LocalDate;

public class Automovel {

    protected String marca;
    protected String modelo;
    protected String cor;
    protected String combustivel;
    protected float precoCusto;
    protected int ano;

    public Automovel(String marca, String modelo, String cor, String combustivel, float precoCusto, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.precoCusto = precoCusto;
        this.ano = ano;
        
    }

    public Automovel(String marca, String modelo, String cor, String combustivel, float precoCusto) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.precoCusto = precoCusto;
        ano = LocalDate.now().getYear();//captura o ano do sistema operecional naquele momento
       
    }

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

    @Override
    public String toString() {
        return "Dados do automóvel"
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nCor: " + cor
                + "\nCombustível: " + combustivel
                + "\nAno: " + ano
                + "\nPreço de custo R$" + precoCusto
                + "\nPreço de venda R$" + quantoCusta();

    }

    public double quantoCusta() {
        double precoVenda=0;
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
        return precoVenda;
    }
}
