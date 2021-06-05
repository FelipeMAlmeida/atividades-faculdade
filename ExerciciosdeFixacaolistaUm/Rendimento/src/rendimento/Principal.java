package rendimento;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
          Banco objBanco = new Banco();
          objBanco.setValorDepositado(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser depositado")));
          objBanco.setValorJuros(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor dos juros")));
          
          JOptionPane.showMessageDialog(null,"Essa é o seu rendimento: " + objBanco.calcularJuros());
          JOptionPane.showMessageDialog(null,"Essa é o valor total: " + objBanco.calcularTotal());
          System.exit(0);
    }
    
}
