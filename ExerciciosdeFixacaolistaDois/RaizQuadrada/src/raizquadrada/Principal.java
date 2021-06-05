package raizquadrada;
//Faça um aplicativo que receba um número inteiro, calcule e exiba a raiz quadrada desse número.

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Raiz objRaiz = new Raiz();
        objRaiz.setValor(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor")));
        JOptionPane.showMessageDialog(null,"A raiz de "+objRaiz.getValor() +" é: "+objRaiz.calcularRaiz());
        System.exit(0);
    }
    
}
