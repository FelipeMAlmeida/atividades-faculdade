package appimoveis;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
      Imovel imo= new Imovel();
      imo.setIdentificacao(JOptionPane.showInputDialog(null,"Insira a identificação do imóvel: ","EX.Imovel",3));
      imo.setImposto(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor do Imposto sobre o imóvel: ","EX.Imovel",3)));
      imo.setMesesAtraso(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira os meses de atraso do imóvel: ","EX.Imovel",3)));
      
      JOptionPane.showMessageDialog(null,"Os seguintes dados sobre o imóvel são:\n" + imo.valorAtraso(),"EX.Imovel",1);
      System.exit(0);
    }
    
}
