package apppositivonegativo;

import javax.swing.JOptionPane;

public class Principal {

   
    public static void main(String[] args) {
        PositivoNegativo objPositivoNegativo = new PositivoNegativo();
        objPositivoNegativo.setNumero(Float.parseFloat(JOptionPane.showInputDialog("Insira um Número: ")));
        JOptionPane.showMessageDialog(null,"O resultado é: " + objPositivoNegativo.numeroPositivo());
        System.exit(0);
    }
    
}
