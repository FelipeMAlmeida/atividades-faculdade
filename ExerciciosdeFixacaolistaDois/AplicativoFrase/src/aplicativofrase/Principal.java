package aplicativofrase;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Frase objFrase = new Frase();
        objFrase.setFrase(JOptionPane.showInputDialog("Insira uma frase aqui"));
        JOptionPane.showMessageDialog(null,"essa é sua frase em caixa alta: " +objFrase.fraseConvertida());
        System.exit(0);
    }
    
}
