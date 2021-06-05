
package arame;

import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
       Terreno objTerreno = new Terreno();
        objTerreno.setLargura(Double.parseDouble(JOptionPane.showInputDialog("Insira a largura do terreno")));
        objTerreno.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do terreno")));
        
        JOptionPane.showMessageDialog(null,"Esse é a quantidade de arame necessária: " + objTerreno.calcularAreaTerreno());
        System.exit(0);
    }
    }
    

