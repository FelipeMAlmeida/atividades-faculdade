
package appproduto;

import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
       Pagamento objPagamento = new Pagamento();
       objPagamento.setValorEtiqueta(Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do produto: ")));
       objPagamento.setTipoPagamento(Float.parseFloat(JOptionPane.showInputDialog("Insira o tipo de pagamento:\n '0' se for a vista "
                                                                                    + "\n '1' se for com cartão de crédito "
                                                                                    + "\n '2' se for em duas vezes no cartão "
                                                                                    + "\n '3' se for em três vezes no cartão")));
       JOptionPane.showMessageDialog(null, "o valor final do produto com base em seu meio de pagamento é: " +objPagamento.metodoPagamento());
       System.exit(0);
    }
    
}
