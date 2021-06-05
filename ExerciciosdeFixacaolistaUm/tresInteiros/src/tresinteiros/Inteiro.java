/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresinteiros;

/**
 *
 * @author felip
 */
public class Inteiro {
    private int valorUm;
    private int valorDois;
    private int valorTres;

    public int getValorUm() {
        return valorUm;
    }

    public void setValorUm(int valorUm) {
        this.valorUm = valorUm;
    }

    public int getValorDois() {
        return valorDois;
    }

    public void setValorDois(int valorDois) {
        this.valorDois = valorDois;
    }

    public int getValorTres() {
        return valorTres;
    }

    public void setValorTres(int valorTres) {
        this.valorTres = valorTres;
    }
    
    public double calcularMedia (){
        double calcularMedia = (valorUm + valorDois + valorTres)/3;
        return calcularMedia;
    }
    public double calcularSoma (){
        double calcularSoma = valorUm + valorDois + valorTres;
        return calcularSoma;
    }
    public double calcularProduto (){
        double calcularProduto = valorUm * valorDois * valorTres;
        return calcularProduto;
    }
    
}
