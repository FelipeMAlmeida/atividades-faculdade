package operacoesbasicas;

import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        Operacoes objOperacoes = new Operacoes();
        objOperacoes.setValorUm(Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: ")));
        objOperacoes.setValorDois(Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor: ")));
        JOptionPane.showMessageDialog(null,"Essa é a sua soma: " + objOperacoes.calcularSoma());
        JOptionPane.showMessageDialog(null,"Essa é a sua subtração: " + objOperacoes.calcularSubtracao());
        JOptionPane.showMessageDialog(null,"Essa é o seu produto: " + objOperacoes.calcularProduto());
        JOptionPane.showMessageDialog(null,"Essa é a sua divisão: " + objOperacoes.calcularDivisao());
    }
    
}
