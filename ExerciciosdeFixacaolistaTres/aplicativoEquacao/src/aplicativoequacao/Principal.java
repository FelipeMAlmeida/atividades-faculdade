package aplicativoequacao;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Equacao2Grau objEquacao2Grau = new Equacao2Grau();
        objEquacao2Grau.setA(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A: ")));
        objEquacao2Grau.setB(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B: ")));
        objEquacao2Grau.setC(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de C: ")));
        JOptionPane.showMessageDialog(null,"Os valores de X são: " + objEquacao2Grau.raizes());
        System.exit(0);
    }
    
}
