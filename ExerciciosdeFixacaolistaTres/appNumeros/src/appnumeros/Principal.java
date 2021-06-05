package appnumeros;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Numeros objNumeros = new Numeros();
        JOptionPane.showMessageDialog(null,"Insira três valores inteiros diferentes");
        objNumeros.setNumeroUm(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do primeiro número: ")));
        objNumeros.setNumeroDois(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do segundo número: ")));
        objNumeros.setNumeroTres(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do terceiro número: ")));
        JOptionPane.showMessageDialog(null,""+objNumeros.maiorNumero());
        JOptionPane.showMessageDialog(null,""+objNumeros.menorNumero());
        JOptionPane.showMessageDialog(null,"A ordem crescente desse números é: "+objNumeros.ordemCrescente());
        JOptionPane.showMessageDialog(null,"Essa é a soma caso os números sejam pares: "+objNumeros.saoPares());
        JOptionPane.showMessageDialog(null,"Essa é o produto caso dois números sejam ímpares: "+objNumeros.numerosImpares());
        System.exit(0);
    }
    
}
